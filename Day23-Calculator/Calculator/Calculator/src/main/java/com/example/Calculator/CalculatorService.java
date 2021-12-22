package com.example.Calculator;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorService {
    @RequestMapping("/add/{x}/{y}")
    public Response add(@PathVariable int x, @PathVariable int y) {
        return new Response(x,y,x+y);
    }

    @RequestMapping("/sub/{x}/{y}")
    public Response sub(@PathVariable int x, @PathVariable int y) {
        return new Response(x,y,x-y);
    }

    @RequestMapping("/div/{x}/{y}")
    public Response div(@PathVariable int x, @PathVariable int y) {
        return new Response(x,y,x/y);
    }

    @RequestMapping("/mul/{x}/{y}")
    public Response mul(@PathVariable int x, @PathVariable int y) {
        return new Response(x,y,x*y);
    }
}
