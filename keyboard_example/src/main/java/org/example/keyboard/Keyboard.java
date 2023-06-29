package org.example.keyboard;

import org.example.keyboard.key.Switch;

public interface Keyboard {

    void connect();

    Switch getSwitch();

    default void enterKey(String key) {
        getSwitch().click(key);
    }
}
