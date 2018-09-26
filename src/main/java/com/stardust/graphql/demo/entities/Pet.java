package com.stardust.graphql.demo.entities;

import com.stardust.graphql.demo.enums.Animal;

public abstract class Pet {
    private int id;

    private String name;

    private Animal type;

    private int age;

    private int ownerId;

    public Pet(int id, int ownerId, String name, Animal type, int age) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.age = age;
        this.ownerId = ownerId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal getType() {
        return type;
    }

    public void setType(Animal type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }
}