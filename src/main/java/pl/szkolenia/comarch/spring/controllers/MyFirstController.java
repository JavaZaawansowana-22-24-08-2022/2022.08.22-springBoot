package pl.szkolenia.comarch.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyFirstController {

    @RequestMapping(value = "/main", method = RequestMethod.GET)
    public String cos() {
        System.out.println("cos sie dzieje !!!");
        return "main";
    }

    @RequestMapping(value = "/cos", method = RequestMethod.GET)
    public String cos2() {
        System.out.println("dzieje sie cos innego !!!");
        return "cos2";
    }
}
