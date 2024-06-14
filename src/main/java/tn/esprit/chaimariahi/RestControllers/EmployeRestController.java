package tn.esprit.chaimariahi.RestControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.chaimariahi.Entities.Employe;
import tn.esprit.chaimariahi.Services.EmployeService;

@RestController
@RequestMapping("/api")
public class EmployeRestController {

        @Autowired
        private EmployeService employeService;

        @PostMapping("/employes")
        public Employe addEmploye(@RequestBody Employe employe, @RequestParam String companyName) {
            return employeService.addEmployeAndAssignToCompany(employe, companyName);


        }
}