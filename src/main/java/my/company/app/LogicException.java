package my.company.app;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;


@ResponseStatus(code = HttpStatus., reason="LogicException")
public class LogicException 
 extends RuntimeException
{

    public LogicException() {
        super("LogicException");
        
    }
}

