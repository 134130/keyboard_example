package org.example.keyboard.key;

public class BlueSwitch implements Switch {
    @Override
    public void click(String key) {
        System.out.println("찰칵! " + key);
    }
}
