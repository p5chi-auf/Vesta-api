package com.vesta.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SwaggerControl {

    @RequestMapping("/")
    public @ResponseBody
    String greeting() {
        return "Some text";
    }

}
