package com.example.serializationdemo.space;

import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.io.*;

@RequiredArgsConstructor
@Slf4j
public class SpaceShipSerializationHelper {
    private final SpaceShip spaceship;
    private static final String FILE_LOCATION= "serialized/spaceship.ser";

    public void serialize(){
        try {
            FileOutputStream fileOut =
                    new FileOutputStream(FILE_LOCATION);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(spaceship);
            out.close();
            fileOut.close();
            log.info("The spaceship has been saved to disk");
        } catch (IOException i) {
            throw new RuntimeException("Could not serialize spaceship", i);
        }
    }

}
