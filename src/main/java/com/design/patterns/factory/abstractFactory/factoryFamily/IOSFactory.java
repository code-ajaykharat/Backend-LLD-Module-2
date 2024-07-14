package com.design.patterns.factory.abstractFactory.factoryFamily;

import com.design.patterns.factory.abstractFactory.components.button.Button;
import com.design.patterns.factory.abstractFactory.components.button.IOSButton;
import com.design.patterns.factory.abstractFactory.components.dropdown.DropDown;
import com.design.patterns.factory.abstractFactory.components.dropdown.IOSDropDown;
import com.design.patterns.factory.abstractFactory.components.menu.IOSMenu;
import com.design.patterns.factory.abstractFactory.components.menu.Menu;

public class IOSFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new IOSButton();
    }

    @Override
    public Menu createMenu() {
        return new IOSMenu();
    }

    @Override
    public DropDown createDropDown() {
        return new IOSDropDown();
    }
}
