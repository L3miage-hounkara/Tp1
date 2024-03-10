package fr.uga.l3miage.tp1.exo1.models;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

import fr.uga.l3miage.tp1.exo1.PowerType;
import fr.uga.l3miage.tp1.exo1.WeightUnity;

@Entity
@Table(name="car_porshe")
public class CarEntity {
    @Id
    @Column(name = "immat",length = 8)
    private String immatriculation;
    //attribut immatriculation coorespond a l'attribut immat
    @Column(name = "cylinder_capacity")
    private Double cylinderCapacity;
    //pareil pour le cas de cylinderCapacity
    @Column(name = "weight")
    private Integer weight;

    @Column(name = "torque")
    private Integer torque;

    @Column(name ="power")
    private Integer power;

    @Column(name= "circulation_date")
    private LocalDate circulationDate;

    @Column(name = "power_type")
    @Enumerated(EnumType.ORDINAL)
    private PowerType powerType;

    @Column(name= "weight_unity")
    @Enumerated(EnumType.STRING)
    private WeightUnity weightUnity;


    

    
}
