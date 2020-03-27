package danieldrzazga.com.github.weedingplaner.exceptions;

/**
 * Created by "Daniel Drzazga" on 25.03.2020
 */
public class GuestNotFoundException extends RuntimeException {

    public GuestNotFoundException(long id) {
        super("Could not find Guest: " + id);
    }

}
