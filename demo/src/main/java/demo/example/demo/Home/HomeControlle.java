package demo.example.demo.Home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeControlle {
  @GetMapping("/")
  public String home() {
      return "index";
  }
    
}
