package org.example.keyboard;

import org.example.keyboard.key.BlueSwitch;
import org.example.keyboard.key.RedSwitch;

public class KeychronKeyboard {
    private RedSwitch redSwitch;
    private BlueSwitch blueSwitch;

    public KeychronKeyboard(RedSwitch _switch) {
        redSwitch = _switch;
    }

    public KeychronKeyboard(BlueSwitch _switch) {
        blueSwitch = _switch;
    }

    public void connect() {
        System.out.println("Keychron Keyboard is now available.");
    }

    public void enterKey(String key) {
        if (redSwitch != null) {
            redSwitch.click(key);
        } else if (blueSwitch != null) {
            blueSwitch.click(key);
        }
    }
}
