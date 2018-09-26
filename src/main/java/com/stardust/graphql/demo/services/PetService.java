package com.stardust.graphql.demo.services;

import com.stardust.graphql.demo.entities.Bird;
import com.stardust.graphql.demo.entities.Dog;
import com.stardust.graphql.demo.entities.Owner;
import com.stardust.graphql.demo.entities.Pet;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class PetService {
    Map<Integer, Pet> repository = new HashMap();

    public PetService() {
        repository.put(1, new Dog(1, 1,"Lily",2,"123"));
        repository.put(2, new Bird(2, 1,"Tom", 4));
        repository.put(3, new Dog(3, 2,"Bob", 6, "567"));
    }

    public Pet getPetById(int id) {
        return repository.get(id);
    }

    public Pet savePet(Pet pet) {
        return repository.put(pet.getId(), pet);
    }

    public Collection<Pet> getPets() {
        return repository.values();
    }
}
