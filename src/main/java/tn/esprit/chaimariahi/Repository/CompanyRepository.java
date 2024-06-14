package tn.esprit.chaimariahi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.chaimariahi.Entities.Company;

import java.util.Optional;

public interface CompanyRepository  extends JpaRepository<Company, Long> {
    Optional<Company> findByCompanyName(String companyName);
}
