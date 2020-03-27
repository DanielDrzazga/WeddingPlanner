package danieldrzazga.com.github.weedingplaner.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by "Daniel Drzazga" on 25.03.2020
 */
@Entity
@Table(name = "token")
@Getter
@Setter
@NoArgsConstructor
public class Token {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String value;

    @OneToOne
    private Spouse spouse;

}
