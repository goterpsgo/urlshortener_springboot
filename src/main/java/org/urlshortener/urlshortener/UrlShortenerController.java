package org.urlshortener.urlshortener;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class UrlShortenerController {
    @RequestMapping("/")
    public String index() {
        return "Hello world";
    }
}
