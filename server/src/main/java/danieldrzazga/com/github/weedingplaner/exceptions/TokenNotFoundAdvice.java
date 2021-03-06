package danieldrzazga.com.github.weedingplaner.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * Created by "Daniel Drzazga" on 27.03.2020
 */
@RestControllerAdvice
public class TokenNotFoundAdvice {

    @ExceptionHandler(TokenNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String tokenNotFoundHandler(TokenNotFoundException e){
        return e.getMessage();
    }

}
