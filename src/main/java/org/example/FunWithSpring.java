package org.example;

import org.example.repo.FunRepo;
import org.example.services.FunService;

/**
 * Hello world!
 *
 */
public class FunWithSpring
{
    public static void main( String[] args )
    {
        final var funRepo = new FunRepo();
        new FunService(funRepo);
    }
}
