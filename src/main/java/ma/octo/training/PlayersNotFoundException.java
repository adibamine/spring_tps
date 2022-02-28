package ma.octo.training;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.NOT_FOUND,
        reason="Players Not Found")
public class PlayersNotFoundException extends RuntimeException{
}
