package tn.esprit.chaimariahi.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.time.LocalDate;


@ToString
@NoArgsConstructor
@Setter
@Getter
@Entity
public class Donation implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Float amount;
    private LocalDate date;

    @Enumerated(EnumType.STRING)
    private DonationType type;

    @ManyToOne
    @JoinColumn(name = "employe_id")
    private Employe employe;
}
