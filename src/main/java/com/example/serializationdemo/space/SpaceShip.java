package com.example.serializationdemo.space;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SpaceShip implements Serializable {
    private static final long serialVersionUID = 1L;
    private String model;
    private transient int fuel;
    private String captain;
    private String weapon;
}
