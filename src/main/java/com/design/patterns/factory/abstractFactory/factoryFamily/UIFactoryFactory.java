package com.design.patterns.factory.abstractFactory.factoryFamily;

import com.design.patterns.factory.abstractFactory.Platform;

public class UIFactoryFactory {
    public static UIFactory createFactory(Platform platform){
        if(platform.equals(Platform.ANDROID)) return new AndroidFactory();
        else if(platform.equals(Platform.IOS)) return new IOSFactory();
        else if(platform.equals(Platform.MACOS)) return  new MacOSFactory();
        return null;
    }
}
