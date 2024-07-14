package com.design.patterns.factory.abstractFactory.factoryFamily;

import com.design.patterns.factory.abstractFactory.components.button.Button;
import com.design.patterns.factory.abstractFactory.components.dropdown.DropDown;
import com.design.patterns.factory.abstractFactory.components.menu.Menu;

public interface UIFactory {
    Button createButton();
    Menu createMenu();
    DropDown createDropDown();
}
