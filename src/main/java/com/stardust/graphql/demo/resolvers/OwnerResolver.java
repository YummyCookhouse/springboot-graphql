package com.stardust.graphql.demo.resolvers;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.stardust.graphql.demo.entities.Owner;
import com.stardust.graphql.demo.enums.PhotoIDType;
import com.stardust.graphql.demo.services.PhotoIDService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OwnerResolver implements GraphQLResolver<Owner> {
    @Autowired
    PhotoIDService service;

    public String identifier(Owner owner, PhotoIDType type) {
        return service.getIdentifierForOwner(owner.getId(), type);
    }
}
