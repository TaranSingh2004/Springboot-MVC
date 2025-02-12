package org.example.HelloWorld.Components;

import org.springframework.stereotype.Component;

@Component
public class Student {
    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }
}
