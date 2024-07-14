package com.design.patterns.factory.abstractFactory.factoryFamily;

import com.design.patterns.factory.abstractFactory.components.button.Button;
import com.design.patterns.factory.abstractFactory.components.dropdown.DropDown;
import com.design.patterns.factory.abstractFactory.components.menu.Menu;

public class MacOSFactory implements UIFactory{
    @Override
    public Button createButton() {
        return null;
    }

    @Override
    public Menu createMenu() {
        return null;
    }

    @Override
    public DropDown createDropDown() {
        return null;
    }
}
