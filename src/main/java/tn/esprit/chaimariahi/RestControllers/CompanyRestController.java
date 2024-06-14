package tn.esprit.chaimariahi.RestControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.chaimariahi.Entities.Company;
import tn.esprit.chaimariahi.Services.CompanyService;

@RestController
@RequestMapping("/api")
public class CompanyRestController {
    @Autowired
    private CompanyService companyService;

    @PostMapping("/companies")
    public Company addCompany(@RequestBody Company company) {
        return companyService.addCompany(company);
    }
}
