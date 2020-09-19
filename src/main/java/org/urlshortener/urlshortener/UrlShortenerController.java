package org.urlshortener.urlshortener;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class UrlShortenerController {
    @RequestMapping("/")
    public String hello_world() {
        return "Hello world";
    }

    @GetMapping(value = "/index")
    public String index() {
        return "index";
    }

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }

    @RequestMapping("/bec")
    public String bec() {
        return "I ❤️ Bec";
    }
}
