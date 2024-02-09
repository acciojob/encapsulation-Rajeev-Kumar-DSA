package com.driver;

import javax.sound.midi.Soundbank;

public class Main {
    public static void main(String[] args) {

        RWOnly rwOnly = new RWOnly();

        // Without using getter and setter method
        // when try to set a value to name directly
        // rwOnly.name = "Rajeev Kumar";  // Error: The field RWOnly.name is not visible

        // when try to print the value of name directly
        // System.out.println(rwOnly.name); // Error: The field RWOnly.name is not visible


        // Set value to name using setter method
        rwOnly.setName("Rajeev Kumar");


        // Print value of name using getter method
        System.out.println(rwOnly.getName());

    }
}