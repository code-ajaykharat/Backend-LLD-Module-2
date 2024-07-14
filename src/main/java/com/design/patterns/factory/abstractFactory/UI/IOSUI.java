package com.design.patterns.factory.abstractFactory.UI;

import com.design.patterns.factory.abstractFactory.factoryFamily.IOSFactory;
import com.design.patterns.factory.abstractFactory.factoryFamily.UIFactory;

public class IOSUI extends FlutterUI{
    @Override
    public UIFactory createFactory1() {
        return new IOSFactory();
    }
}
