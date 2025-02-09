package org.example.repositories;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Random;

@Repository
public class FunRepo {

    public List<String> getList() {
        return List.of("Fun fact1", "Fun fact3");
    }

    public int getRecordsCount() {
        return new Random().nextInt();
    }
}
