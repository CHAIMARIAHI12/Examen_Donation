package tn.esprit.chaimariahi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tn.esprit.chaimariahi.Entities.Employe;

import java.util.List;

public interface EmployeRepository extends JpaRepository<Employe, Long> {
    @Query("SELECT e FROM Employe e WHERE e.company.companyName = :companyName AND e.company.address LIKE %:area%")
    List<Employe> findByCompanyAndArea(@Param("companyName") String companyName, @Param("area") String area);
}
