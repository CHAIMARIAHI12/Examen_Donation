package tn.esprit.chaimariahi.Services;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.chaimariahi.Entities.Company;
import tn.esprit.chaimariahi.Repository.CompanyRepository;

@Service
@AllArgsConstructor
public class CompanyService implements ICompany {
    @Autowired
    private CompanyRepository companyRepository;
    @Override
    public Company addCompany(Company company) {
        if (company.getCompanyName() == null) {
            throw new IllegalArgumentException("Company name cannot be null");
        }
        return companyRepository.save(company);
    }
}
