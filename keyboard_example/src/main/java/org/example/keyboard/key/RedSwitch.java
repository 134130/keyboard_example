package org.example.keyboard.key;

public class RedSwitch implements Switch {


    @Override
    public void click(String key) {
        System.out.println("딱! " + key);
    }
}
