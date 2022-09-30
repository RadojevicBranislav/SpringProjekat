package com.boot.models;


import lombok.Data;

import javax.persistence.*;

@Data
@Table(name = "artists")
public class Artist {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Enumerated(EnumType.STRING)
    private Type type;

    private String firstName;

    private String lastName;



}
