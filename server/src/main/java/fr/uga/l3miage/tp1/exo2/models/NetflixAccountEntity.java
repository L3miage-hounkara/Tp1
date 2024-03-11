package fr.uga.l3miage.tp1.exo2.models;


import fr.uga.l3miage.tp1.exo2.models.NetflixUserEntity;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
public class NetflixAccountEntity {
    @Id
    @Column(name = "id")
    private BigInteger id;

    @Column(name = "nb_devices")
    private  int nbDevices;


    @Column(name = "type_account")
    @Enumerated(EnumType.STRING)
    private String typeAccount;


    @Column(name = "uuid_user")
    private String uuidUser;

    @OneToOne(mappedBy = "netflixAccount")
    private NetflixUserEntity netflixUser;


}
