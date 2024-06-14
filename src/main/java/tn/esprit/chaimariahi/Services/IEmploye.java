package tn.esprit.chaimariahi.Services;

import tn.esprit.chaimariahi.Entities.Employe;

import java.util.List;

public interface IEmploye {
    Employe addEmployeAndAssignToCompany(Employe employe, String companyName);
    List<Employe> getEmployeByArea(String companyName, String area);
}

