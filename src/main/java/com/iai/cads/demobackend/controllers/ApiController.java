package com.iai.cads.demobackend.controllers;

import com.iai.cads.demobackend.UserConfService;
import com.iai.cads.demobackend.model.UserConf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
 * @author Evgeny Borisov
 */
@RestController
@RequestMapping("/api")
public class ApiController {

    @Autowired
    private UserConfService userConfService;

    @Autowired
    private RestTemplate restTemplate;

    @Value("${helper.url}")
    private String helperUrl;


    @GetMapping("/quotes")
    public String quotesOfChuckAndGameofThrones() {

        return restTemplate.getForObject(helperUrl, String.class)+" "+userConfService.createUserConf().getCommand();
    }

    @GetMapping("/ping")
    public String ping() {
        return "Anatoliy, calm down, everything is ok";
    }

    //api/sum?a=12&b=13
    @GetMapping("/sum")
    public Integer sum(@RequestParam("a") int a, @RequestParam("b") int b) {
        return a + b;
    }

    // /api/uppertext/free_text/12
    @GetMapping("/uppertext/{text}/{id}")
    public String upperCased(@PathVariable("text") String text, @PathVariable("id") Integer id) {
        return text.toUpperCase() + id * 100;
    }


    @GetMapping("/conf")
    public UserConf getConf() {
        return userConfService.createUserConf();
    }


    @PostMapping("/conf")
    public String saveNewConf(@RequestBody UserConf userConf) {
        System.out.println(userConf + " was saved successfully");
        return "thank you!";
    }


}
