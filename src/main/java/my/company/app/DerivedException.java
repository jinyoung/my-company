package my.company.app;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;


@ResponseStatus(code = HttpStatus., reason="DerivedException")
public class DerivedException 
 extends RuntimeException
{

    public DerivedException() {
        super("DerivedException");
        
    }
}

