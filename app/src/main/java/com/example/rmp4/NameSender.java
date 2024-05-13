package com.example.rmp4;


import java.io.Serializable;

public class NameSender implements Serializable {
    String name, surname;

    public NameSender(String name, String surname){
        this.name = name;
        this.surname = surname;
    }
}
