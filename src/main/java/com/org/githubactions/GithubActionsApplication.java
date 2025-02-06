package com.org.githubactions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GithubActionsApplication {

    @GetMapping("/print")
    public String welcome() {
        return "Welcome to Github Actions";
    }

    public static void main(String[] args) {
        SpringApplication.run(GithubActionsApplication.class, args);
    }

}
