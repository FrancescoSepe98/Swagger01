package develhope.it.Swagger.Example.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
public class DefaultController {

    @GetMapping()
    public String hi(){
        return "Welcome on the 1234 port";
    }
}
