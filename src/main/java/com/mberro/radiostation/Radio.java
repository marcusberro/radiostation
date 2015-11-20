package com.mberro.radiostation;

import javazoom.jl.player.Player;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

/**
 * Created by Berro on 20/11/15.
 */
public class Radio {

    public static void main(String[] args) {

        //Get file from resources folder
        ClassLoader classLoader = Radio.class.getClassLoader();
        File songFile = new File(classLoader.getResource("tiovelho.mp3").getFile());

        try{
            FileInputStream stream = new FileInputStream(songFile);
            BufferedInputStream buffer = new BufferedInputStream(stream);
            Player player = new Player(buffer);
            System.out.println("Playing...");
            player.play();
            System.out.println("Shutting down");
        }
        catch (Exception e) {
            System.out.println("Error!");
            e.printStackTrace();
        }
    }
}
