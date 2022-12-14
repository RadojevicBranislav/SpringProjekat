package com.boot.models;


import lombok.Data;

import javax.persistence.*;

@Data
@Table(name = "artists")
@Entity
public class Artist {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Enumerated(EnumType.STRING)
    private Type type;

    private String firstName;

    private String lastName;

    public Artist(Type type, String firstName, String lastName) {
        this.type = type;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Artist(Integer id, Type type, String firstName, String lastName) {
        this.id = id;
        this.type = type;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Artist() {
    }
}
