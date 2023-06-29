package org.example;

import org.example.keyboard.HappyHackingKeyboard;
import org.example.keyboard.KeychronKeyboard;
import org.example.keyboard.key.BlueSwitch;
import org.example.keyboard.key.RedSwitch;

public class Main {
    public static void main(String[] args) {

        System.out.println();
        
        var keychronWithBlueSwitch = new KeychronKeyboard(new BlueSwitch());

        keychronWithBlueSwitch.connect();
        keychronWithBlueSwitch.enterKey("A");
        keychronWithBlueSwitch.enterKey("B");

        System.out.println();

        var happyHackingWithRedSwitch = new HappyHackingKeyboard(new RedSwitch());

        happyHackingWithRedSwitch.connect();
        happyHackingWithRedSwitch.enterKey("A");
        happyHackingWithRedSwitch.enterKey("B");
    }
}