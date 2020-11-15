package org.example;

import java.util.UUID;

public class Department {
    private String id;
    private String name;

    public Department(String name) {
        this.name = name;
        this.id = generation();
    }

    private static String generation() {
        return UUID.randomUUID().toString();
    }

    @Override
    public String toString() {
        return "Department{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}


