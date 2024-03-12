package fr.uga.l3miage.tp1.exo2.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.util.UUID;


@Entity
public class Session {
    @Id
    @Column(name = "id_session")
    private UUID idSession;



    @Column(name = "last_command")
    private String lastCommand;

    @Column(name = "current_dir")
    private String currentDir;

    @Column(name = "lock")
    private boolean lock;


    @OneToOne(mappedBy = "session")
    private User user;
}
