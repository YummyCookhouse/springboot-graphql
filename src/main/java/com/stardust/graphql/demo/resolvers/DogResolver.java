package com.stardust.graphql.demo.resolvers;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.stardust.graphql.demo.entities.Dog;
import com.stardust.graphql.demo.entities.Owner;
import com.stardust.graphql.demo.services.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DogResolver implements GraphQLResolver<Dog> {
    @Autowired
    protected OwnerService service;

    public Owner owner(Dog pet) {
        return service.getOwnerById(pet.getOwnerId());
    }
}