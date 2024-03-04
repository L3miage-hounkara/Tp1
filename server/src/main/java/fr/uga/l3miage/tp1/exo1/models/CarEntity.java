package fr.uga.l3miage.tp1.exo1.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="car_porshe")
public class CarEntity {
    @Column(name = "immat",length = 8)
    private String immatriculation;
    //attribut immatriculation coorespond a l'attribut immat

    
    @Id
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }


}
