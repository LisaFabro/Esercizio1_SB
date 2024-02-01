package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class Greetings {
    @RequestMapping(method = RequestMethod.GET, path = "/ciao")
    public String ciao(@RequestParam String nome, @RequestParam String provincia){
        return "Ciao " + nome + " com'é il tempo in " + provincia + "?";
    }
}
