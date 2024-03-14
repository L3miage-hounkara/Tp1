package fr.uga.l3miage.tp1.exo3.models;


import javax.persistence.*;
import java.util.List;

@Entity
public class FederationEntity {
    @Id
    private String name;

    @Column(name = "is_fage_membership")
    private boolean isFageMembership;

    @ManyToOne
    @JoinColumn(foreignKey=@ForeignKey(name = "Fk_federation_association"))
    AssociationEntity association;

    @OneToMany(mappedBy = "federation")
    List<AssociationEntity> associations;

}
