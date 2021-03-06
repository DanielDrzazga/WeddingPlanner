package danieldrzazga.com.github.weedingplaner.model;

import lombok.Getter;

/**
 * Created by "Daniel Drzazga" on 25.03.2020
 */
@Getter
public enum Role {
    ADMIN ("ROLE_ADMIN"),
    SPOUSE ("ROLE_SPOUSE");

    private final String role;

    Role(final String role) {
        this.role = role;
    }

}
