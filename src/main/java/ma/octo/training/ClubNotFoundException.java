package ma.octo.training;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.NOT_FOUND,
        reason="Club Not Found")
public class ClubNotFoundException extends RuntimeException {
}
