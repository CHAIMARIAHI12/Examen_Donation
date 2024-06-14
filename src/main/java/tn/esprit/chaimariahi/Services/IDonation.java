package tn.esprit.chaimariahi.Services;

import tn.esprit.chaimariahi.Entities.Donation;
import tn.esprit.chaimariahi.Entities.DonationType;

import java.util.Set;

public interface IDonation {
    Donation addDonation(Donation donation);
    Set<Donation> getDonationByType(DonationType type);

}
