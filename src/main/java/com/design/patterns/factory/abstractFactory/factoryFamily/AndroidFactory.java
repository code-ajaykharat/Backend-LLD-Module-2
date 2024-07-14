package com.design.patterns.factory.abstractFactory.factoryFamily;

import com.design.patterns.factory.abstractFactory.components.button.AndroidButton;
import com.design.patterns.factory.abstractFactory.components.button.Button;
import com.design.patterns.factory.abstractFactory.components.dropdown.AndroidDropDown;
import com.design.patterns.factory.abstractFactory.components.dropdown.DropDown;
import com.design.patterns.factory.abstractFactory.components.menu.AndroidMenu;
import com.design.patterns.factory.abstractFactory.components.menu.Menu;

public class AndroidFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }

    @Override
    public DropDown createDropDown() {
        return new AndroidDropDown();
    }
}
