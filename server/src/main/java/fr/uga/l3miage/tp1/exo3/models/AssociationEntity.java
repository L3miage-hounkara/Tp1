package fr.uga.l3miage.tp1.exo3.models;

import fr.uga.l3miage.tp1.exo3.enums.AssociationType;

import javax.persistence.*;
import java.util.List;

@Entity
public class AssociationEntity {
    @Id
    private String name;

    @Column(name = "president_name",nullable = false)
    private String presidentName;

    @Column(name = "treasurer_name",nullable = false)
    private String treasurerName;

    @Column(name = "secretary_name")
    private String secretaryName;

    @Column(name = "association_type")
    private AssociationType associationType;



    @ManyToOne
    @JoinColumn(foreignKey=@ForeignKey(name = "Fk_association_federation"))
    FederationEntity federation;

    @OneToMany(mappedBy = "association")
    List<FederationEntity> federations;

}
