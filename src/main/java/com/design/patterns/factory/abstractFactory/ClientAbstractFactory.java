package com.design.patterns.factory.abstractFactory;

import com.design.patterns.factory.abstractFactory.UI.AndroidUI;
import com.design.patterns.factory.abstractFactory.UI.FlutterUI;
import com.design.patterns.factory.abstractFactory.components.button.Button;
import com.design.patterns.factory.abstractFactory.components.menu.Menu;
import com.design.patterns.factory.abstractFactory.factoryFamily.UIFactory;

public class ClientAbstractFactory {
    public static void main(String[] args) {

        UIFactory factoryAndroid = FlutterUI.createFactory2(Platform.ANDROID);
        Button btn = factoryAndroid.createButton();
        btn.display();
        Menu menu = factoryAndroid.createMenu();
        menu.display();

        System.out.println("---------------------");
        UIFactory factoryIos = FlutterUI.createFactory2(Platform.IOS);
        Button btn1 = factoryIos.createButton();
        btn1.display();

        System.out.println("----------ANOTHER WAY-----------");

        //Android UI
        FlutterUI ui = new AndroidUI();
        UIFactory factory = ui.createFactory1();
        Button btn2 = factory.createButton();
        btn2.display();


    }
}
