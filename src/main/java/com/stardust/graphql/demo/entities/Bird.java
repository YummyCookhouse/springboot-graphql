package com.stardust.graphql.demo.entities;

import com.stardust.graphql.demo.enums.Animal;

public class Bird extends Pet {
    private int wings = 2;

    public Bird(int id, int owner, String name, int age) {
        super(id, owner, name, Animal.BIRD, age);
    }

    public int getWings() {
        return wings;
    }

    public void setWings(int wings) {
        this.wings = wings;
    }
}
