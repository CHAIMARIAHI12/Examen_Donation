package tn.esprit.chaimariahi.Entities;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DonationAspect {

    @After("execution(* services.*.addDonation(..))")
    public void afterAddDonation() {
        System.out.println("Merci pour ce don");
    }
}
