package danieldrzazga.com.github.weedingplaner.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * Created by "Daniel Drzazga" on 25.03.2020
 */
@RestControllerAdvice
public class GuestNotFoundAdvice {

    @ExceptionHandler(GuestNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String guestNotFoundHandler(GuestNotFoundException e) {
        return e.getMessage();
    }

}
