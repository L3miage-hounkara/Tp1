package fr.uga.l3miage.tp1.exo1.models;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bike_triumph")
public class BikeEntity {
    @Id
    @Column(name="immat",length = 255,nullable = false)
    private String immatriculation;

    @Column(name = "is_automatic")
    private boolean isAtomatic;

    @Column(name = "capacity_cc")
    private Integer capacityCc;

    @Column(name = "circulation_date")
    private LocalDate ciruculationDate;

    @Column(name = "cylinder_number",length = 255)
    private String cylindNumber;

    @Column(name = "have_shifter")
    private boolean haveShifter;

    @Column(name = "shifter_type")
    private Integer shifterType;

}
