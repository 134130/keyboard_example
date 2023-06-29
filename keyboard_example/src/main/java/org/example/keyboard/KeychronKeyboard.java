package org.example.keyboard;

import org.example.keyboard.key.Switch;

public class KeychronKeyboard implements Keyboard {
    private Switch _switch;

    public KeychronKeyboard(Switch _switch) {
        this._switch = _switch;
    }

    @Override
    public void connect() {
        System.out.println("Keychron Keyboard is now available.");
    }

    @Override
    public Switch getSwitch() {
        return _switch;
    }
}
