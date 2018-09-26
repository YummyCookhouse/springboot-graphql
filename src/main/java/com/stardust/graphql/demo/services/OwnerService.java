package com.stardust.graphql.demo.services;

import com.stardust.graphql.demo.entities.Owner;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class OwnerService {
    Map<Integer, Owner> repository = new HashMap();

    public OwnerService() {
        repository.put(1, new Owner(1, "Lily",2,"Xi'an"));
        repository.put(2, new Owner(2, "Tom", 4,"Beijing"));
        repository.put(3, new Owner(3, "Bob", 6, "Ningbo"));
    }

    public Owner getOwnerById(int id) {
        return repository.get(id);
    }
}
