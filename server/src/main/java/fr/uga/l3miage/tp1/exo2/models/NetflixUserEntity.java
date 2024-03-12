package fr.uga.l3miage.tp1.exo2.models;

import fr.uga.l3miage.tp1.exo2.enums.sex;

import javax.persistence.*;
import java.math.BigInteger;
import java.time.LocalDate;
@Entity
public class NetflixUserEntity {
    @Id
    @Column(name = "id")
    private BigInteger id;


    @Column(name = "uu_id")
    private String uuId;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "sex", length = 2)
    @Enumerated(EnumType.STRING)
    private sex sex;

    @Column(name = "birth_date")
    private LocalDate birthDate;


    @OneToOne
    private NetflixAccountEntity netflixAccount;

}
