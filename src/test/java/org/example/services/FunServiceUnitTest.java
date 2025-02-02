package org.example.services;

import org.example.repo.FunRepo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class FunServiceUnitTest {

    @Mock
    private FunRepo funRepo;

    private FunService funService;

    @BeforeEach
    void setUp() {
        funService = new FunService(funRepo);
    }

    @Test
    void checkIfWeHaveFun() {
        Mockito.doReturn(List.of("Fact1")).when(funRepo).getList();
        final var randomFact = funService.getRandomFact();
        assertEquals("Fact1", randomFact.fact());
    }
}