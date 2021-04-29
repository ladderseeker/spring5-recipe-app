package guru.springframework.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author XIAO JIN
 * @date 2021/04/28/ 20:44
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class NotFoundExceptionSpecific extends RuntimeException {

    public NotFoundExceptionSpecific() {
        super();
    }

    public NotFoundExceptionSpecific(String message) {
        super(message);
    }

    public NotFoundExceptionSpecific(String message, Throwable cause) {
        super(message, cause);
    }

}
