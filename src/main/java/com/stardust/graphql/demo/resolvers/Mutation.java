package com.stardust.graphql.demo.resolvers;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.stardust.graphql.demo.entities.Dog;
import com.stardust.graphql.demo.entities.Pet;
import com.stardust.graphql.demo.services.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Mutation implements GraphQLMutationResolver {
    @Autowired
    private PetService petService;

    public Dog saveDog(int id, String name, int age, int ownerId, String license) {
        Dog dog = null;
        if (id > 0) {
            Pet pet = petService.getPetById(id);
            if (pet instanceof Dog) {
                dog = (Dog)pet;
                dog.setLicense(license);
                dog.setAge(age);
                dog.setName(name);
                dog.setOwnerId(ownerId);
            }
        } else {
            dog = new Dog(new Double(Math.random() * 100).intValue(), ownerId, name, age, license);
        }
        petService.savePet(dog);
        return dog;
    }

}
