package com.stardust.graphql.demo.entities;

import com.stardust.graphql.demo.enums.Animal;

public class Dog extends Pet {
    private String license;

    public Dog(int id, int owner, String name, int age, String license) {
        super(id, owner, name, Animal.DOG, age);
        this.license = license;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }
}
