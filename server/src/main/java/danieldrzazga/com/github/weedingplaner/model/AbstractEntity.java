package danieldrzazga.com.github.weedingplaner.model;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Objects;

/**
 * Created by "Daniel Drzazga" on 24.03.2020
 */
@NoArgsConstructor
@MappedSuperclass
@Getter
public class AbstractEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private LocalDateTime created;
    private LocalDateTime updated;

    @PrePersist
    public void beforeSave() {
        created = LocalDateTime.now();
        updated = null;
    }

    @PreUpdate
    public void beforeUpdate() {
        updated = LocalDateTime.now();
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        AbstractEntity that = (AbstractEntity) obj;
        return Objects.equals(id, that.id);
    }

    @Override
    public String toString() {
        return "AbstractEntity{" +
                "id=" + id +
                ", created=" + created +
                ", updated=" + updated +
                '}';
    }
}
