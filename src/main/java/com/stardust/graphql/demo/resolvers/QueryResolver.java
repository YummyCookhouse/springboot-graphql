package com.stardust.graphql.demo.resolvers;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.stardust.graphql.demo.entities.Pet;
import com.stardust.graphql.demo.services.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class QueryResolver implements GraphQLQueryResolver {

    @Autowired
    PetService service;

    public Collection<Pet> pets() {
        return service.getPets();
    }

    public Pet pet(int id) {
        return service.getPetById(id);
    }
}
