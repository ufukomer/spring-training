package loginform.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Ufuk on 11-07-15.
 */
@Controller
@RequestMapping("/")
public class MainController {

    @RequestMapping(value = {"/", "/welcome**"}, method = RequestMethod.GET)
    public String welcomePage(ModelMap model) {
        model.addAttribute("title", "Spring Security Hello World");
        model.addAttribute("message", "This is welcome page!");
        return "index";
    }

    @RequestMapping(value = "/admin**", method = RequestMethod.GET)
    public String adminPage(ModelMap model) {
        model.addAttribute("title", "Spring Security Hello World");
        model.addAttribute("message", "This is protected page - Admin Page!");
        return "admin";
    }

    @RequestMapping(value = "/dba**", method = RequestMethod.GET)
    public String dbaPage(ModelMap model) {
        model.addAttribute("title", "Spring Security Hello World");
        model.addAttribute("message", "This is protected page - Database Page!");
        return "admin";
    }
}
