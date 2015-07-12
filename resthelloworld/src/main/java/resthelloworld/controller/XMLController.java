package resthelloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import resthelloworld.domain.Coffee;

/**
 * Created by Ufuk on 12-07-15.
 */
@Controller
@RequestMapping("/")
public class XMLController {

    @RequestMapping(method = RequestMethod.GET)
    public String getIndex(ModelMap model) {
        model.addAttribute("title", "Add coffee parameter to URL or Choose One:");
        return "index";
    }

    @RequestMapping(value = "/coffee/{name}", method = RequestMethod.GET,
            produces = "application/xml")
    public @ResponseBody Coffee getCoffeeInXML(@PathVariable String name) {
        Coffee coffee = new Coffee(name, true);
        return coffee;
    }
}
