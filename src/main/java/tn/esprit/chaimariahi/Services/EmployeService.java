package tn.esprit.chaimariahi.Services;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import tn.esprit.chaimariahi.Entities.Company;
import tn.esprit.chaimariahi.Entities.Employe;
import tn.esprit.chaimariahi.Repository.CompanyRepository;
import tn.esprit.chaimariahi.Repository.EmployeRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class EmployeService implements IEmploye {

    @Autowired
    private EmployeRepository employeRepository;
    @Autowired
    private CompanyRepository companyRepository;

    public Employe addEmployeAndAssignToCompany(Employe employe, String companyName) {
        Company company = companyRepository.findByCompanyName(companyName)
                .orElseThrow(() -> new IllegalArgumentException("Company not found"));
        employe.setCompany(company);
        return employeRepository.save(employe);
    }

    @Override
    public List<Employe> getEmployeByArea(String companyName, String area) {
        return employeRepository.findByCompanyAndArea(companyName, area);
    }

    @Scheduled(cron = "0 0 0 1 * *")
    public void getEmployeeWithMostDonations() {

    }
    }

