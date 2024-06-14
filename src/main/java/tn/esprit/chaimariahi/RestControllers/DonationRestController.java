package tn.esprit.chaimariahi.RestControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.chaimariahi.Entities.Donation;
import tn.esprit.chaimariahi.Entities.DonationType;
import tn.esprit.chaimariahi.Services.DonationService;

import java.util.Set;
@RestController
@RequestMapping("/api")
public class DonationRestController {

    @Autowired
    private DonationService donationService;

    @PostMapping("/donations")
    public Donation addDonation(@RequestBody Donation donation) {
        return donationService.addDonation(donation);
    }

    @GetMapping("/donations")
    public Set<Donation> getDonationByType(@RequestParam DonationType type) {
        return donationService.getDonationByType(type);
    }
}

