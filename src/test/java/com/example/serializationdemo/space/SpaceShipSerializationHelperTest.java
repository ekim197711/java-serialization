package com.example.serializationdemo.space;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpaceShipSerializationHelperTest {

    @Test
    void serialize() {
        SpaceShip spaceShip = new SpaceShip();
        spaceShip.setModel("Round");
        spaceShip.setCaptain("Mike");
        spaceShip.setFuel(44);
        new SpaceShipSerializationHelper(spaceShip).serialize();
    }

    @Test
    void deserialize() {
        SpaceShip spaceShip = new SpaceShipDeserializationHelper().deserialize();
        Assertions.assertNotNull(spaceShip);
        Assertions.assertNotNull(spaceShip.getModel());
        Assertions.assertNotNull(spaceShip.getCaptain());
        System.out.println(spaceShip);
    }
}