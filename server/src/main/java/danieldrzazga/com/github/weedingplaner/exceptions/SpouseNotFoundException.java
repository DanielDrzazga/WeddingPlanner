package danieldrzazga.com.github.weedingplaner.exceptions;

/**
 * Created by "Daniel Drzazga" on 27.03.2020
 */
public class SpouseNotFoundException extends RuntimeException {

    public SpouseNotFoundException(String username) {
        super("Could not find Spouse: " + username);
    }

}
