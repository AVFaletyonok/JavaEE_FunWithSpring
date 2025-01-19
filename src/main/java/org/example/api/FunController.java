package org.example.api;

import org.example.services.FunService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunController {

    private final FunService funService;

    public FunController(final FunService funService) {
        this.funService = funService;
    }

    @GetMapping
    public String getFun() {
        return funService.getRandomFact();
    }
}
