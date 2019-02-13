package com.stardust.graphql.demo.resolvers;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.stardust.graphql.demo.entities.Bird;
import com.stardust.graphql.demo.entities.Owner;
import com.stardust.graphql.demo.services.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BirdResolver implements GraphQLResolver<Bird> {
    @Autowired
    private OwnerService service;

    public Owner owner(Bird pet) {
        return service.getOwnerById(pet.getOwnerId());
    }
}