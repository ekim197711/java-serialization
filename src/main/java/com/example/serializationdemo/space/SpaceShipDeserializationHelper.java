package com.example.serializationdemo.space;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.io.*;

@RequiredArgsConstructor
@Slf4j
public class SpaceShipDeserializationHelper {
    private static final String FILE_LOCATION= "serialized/spaceship.ser";

    public SpaceShip deserialize(){
        SpaceShip shipFromFile = null;
        try {
            FileInputStream fileIn = new FileInputStream(FILE_LOCATION);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            shipFromFile = (SpaceShip) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return shipFromFile;
    }
}
