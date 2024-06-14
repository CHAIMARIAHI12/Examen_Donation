package tn.esprit.chaimariahi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.chaimariahi.Entities.Donation;
import tn.esprit.chaimariahi.Entities.DonationType;

import java.util.Set;

public interface DonationRepository   extends JpaRepository<Donation, Long> {
    Set<Donation> findByTypeOrderByDate(DonationType type);
}
