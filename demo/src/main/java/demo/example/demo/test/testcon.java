package demo.example.demo.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class testcon {
    
    @Autowired
    private RdbHandler rdbHandler;

    @GetMapping("/app")
    public String getMethodName() {
        return rdbHandler.getPassword();
    }
    

}
