package org.example.services;

import org.example.controllers.model.FunFactModel;
import org.example.repositories.FunRepo;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class FunService {

    private final FunRepo repo;

    public FunService(final FunRepo repo) {
        this.repo = repo;
    }

    public FunFactModel getRandomFact() {
        final var list = repo.getList();
        final String fact = list.get(new Random().nextInt(list.size()));
        return new FunFactModel(1L, fact);
    }
}
