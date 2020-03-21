package danieldrzazga.com.github.weedingplaner.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by "Daniel Drzazga" on 21.03.2020
 */
@Entity
@Table(name = "guest")
@Getter
@Setter
public class Guest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "guest_id")
    private long id;

    @Column(length = 30)
    private String firstName;

    @Column(length = 30)
    private String lastName;

}
