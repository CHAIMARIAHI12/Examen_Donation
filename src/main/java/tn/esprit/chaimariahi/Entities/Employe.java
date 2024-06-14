package tn.esprit.chaimariahi.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@ToString
@NoArgsConstructor
@Setter
@Getter
@Entity
public class Employe implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String lastName;
    private String firstName;
    private String position;

    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company;
}
