package demo.example.demo.employee;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
public class EmployeeController {
    
    @RequestMapping(value = "/employee") 
    public ModelAndView getMethodName(ModelAndView model) {
        model.addObject("title","qwewqe");
        model.setViewName("index");
        return model; 
    }
    
}
