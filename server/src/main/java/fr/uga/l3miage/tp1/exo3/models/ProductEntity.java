package fr.uga.l3miage.tp1.exo3.models;




import javax.persistence.*;
import java.util.List;

@Entity
public class ProductEntity {
    @Id
    @Column(name = "bar_code_number")
    private String barCodeNumber;

    @Column(name = "name")
    private String name;

    @Column(name = "consumable")
    private boolean consumable;


    @OneToMany(mappedBy = "productEentity")
    private List<BrandEntity> brandEntity;

}
