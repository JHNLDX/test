package com.laudex.demo1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class indexController {

    @GetMapping("")
    public String index() {
        return "Hola mundo";
    }
}
