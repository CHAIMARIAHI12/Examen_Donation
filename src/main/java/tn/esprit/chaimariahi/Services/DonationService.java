package tn.esprit.chaimariahi.Services;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.chaimariahi.Entities.Donation;
import tn.esprit.chaimariahi.Entities.DonationType;
import tn.esprit.chaimariahi.Repository.DonationRepository;

import java.util.Date;
import java.util.Set;

@Service
@AllArgsConstructor
public class DonationService implements IDonation{

    @Autowired
    private DonationRepository donationRepository;
    @Override
    public Donation addDonation(Donation donation) {
        if (donation.getType() == DonationType.MONETARY && donation.getAmount() == null) {
            throw new IllegalArgumentException("Amount is required for monetary donations");
        }
        if (donation.getType() != DonationType.MONETARY) {
            donation.setAmount(0f);
        }
        return donationRepository.save(donation);
    }

    @Override
    public Set<Donation> getDonationByType(DonationType type) {
        return donationRepository.findByTypeOrderByDate(type);
    }

    @PersistenceContext
    private EntityManager entityManager;

    public Float getTotalDonation(Date date1, Date date2) {
        String jpql = "SELECT SUM(d.amount) FROM Donation d WHERE d.date BETWEEN :date1 AND :date2";
        Query query = entityManager.createQuery(jpql);
        query.setParameter("date1", date1);
        query.setParameter("date2", date2);
        return (Float) query.getSingleResult();
    }
}
