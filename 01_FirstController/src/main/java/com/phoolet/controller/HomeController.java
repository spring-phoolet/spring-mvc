package com.phoolet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.*;
/**
 * Created by pierpaolo on 11/03/17.
 */

@Controller
@RequestMapping(value = "/")
public class HomeController {

    @RequestMapping(method = GET)
    public String home() {
        return "home";
    }
}
