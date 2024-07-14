package com.design.patterns.factory.abstractFactory.UI;

import com.design.patterns.factory.abstractFactory.Platform;
import com.design.patterns.factory.abstractFactory.factoryFamily.UIFactory;
import com.design.patterns.factory.abstractFactory.factoryFamily.UIFactoryFactory;

public abstract class FlutterUI {
    public int setRefreshRate(){
        return 100;
    }

    public void setTheme(String theme){
        System.out.println(theme);
    }

    public abstract UIFactory createFactory1();

    public static UIFactory createFactory2(Platform platform){
        return UIFactoryFactory.createFactory(platform);
    }
}
