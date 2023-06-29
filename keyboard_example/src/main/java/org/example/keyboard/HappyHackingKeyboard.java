package org.example.keyboard;

import org.example.keyboard.key.Switch;

public class HappyHackingKeyboard implements Keyboard {

    private Switch _switch;

    public HappyHackingKeyboard(Switch _switch) {
        this._switch = _switch;
    }

    @Override
    public void connect() {
        System.out.println("HappyHacking Keyboard is now available.");
    }

    @Override
    public Switch getSwitch() {
        return _switch;
    }
}
