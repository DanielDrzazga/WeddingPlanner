package danieldrzazga.com.github.weedingplaner.exceptions;

/**
 * Created by "Daniel Drzazga" on 27.03.2020
 */
public class TokenNotFoundException extends RuntimeException {

    public TokenNotFoundException(String name) {
        super("Could not find Token: " + name);
    }

}
