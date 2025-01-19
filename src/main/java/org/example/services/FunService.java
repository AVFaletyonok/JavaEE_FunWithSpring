package org.example.services;

import org.example.repo.FunRepo;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class FunService {

    private final FunRepo repo;

    public FunService(final FunRepo repo) {
        this.repo = repo;
    }

    public String getRandomFact() {
        final var list = repo.getList();
        final String fact = list.get(new Random().nextInt(list.size()));
        return fact;
    }
}
