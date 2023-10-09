package ku.cs.kafe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
@RequestMapping("/") //get put post delete
    public String getHomePage(Model model){
        model.addAttribute("greeting","Sawaddee");
        return "home";
    }
}
//Peerasit Ployaram 6410451237