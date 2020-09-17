package org.urlshortener.urlshortener;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class UrlShortenerController {
    @RequestMapping("/")
    public String hello_world() {
        return "Hello world";
    }

    @RequestMapping(value = "/index")
    public String index() {
        return "index";
    }

    @RequestMapping("/bec")
    public String bec() {
        return "I ❤️ Bec";
    }
}
