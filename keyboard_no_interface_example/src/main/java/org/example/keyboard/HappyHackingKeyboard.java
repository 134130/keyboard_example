package org.example.keyboard;

import org.example.keyboard.key.BlueSwitch;
import org.example.keyboard.key.RedSwitch;

public class HappyHackingKeyboard {
    private RedSwitch redSwitch;
    private BlueSwitch blueSwitch;

    public HappyHackingKeyboard(RedSwitch _switch) {
        redSwitch = _switch;
    }

    public HappyHackingKeyboard(BlueSwitch _switch) {
        blueSwitch = _switch;
    }

    public void connect() {
        System.out.println("HappyHacking Keyboard is now available.");
    }

    public void enterKey(String key) {
        if (redSwitch != null) {
            redSwitch.click(key);
        } else if (blueSwitch != null) {
            blueSwitch.click(key);
        }
    }
}
