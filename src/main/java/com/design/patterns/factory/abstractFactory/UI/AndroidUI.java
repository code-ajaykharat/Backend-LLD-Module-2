package com.design.patterns.factory.abstractFactory.UI;

import com.design.patterns.factory.abstractFactory.factoryFamily.AndroidFactory;
import com.design.patterns.factory.abstractFactory.factoryFamily.UIFactory;

public class AndroidUI extends FlutterUI{

    @Override
    public UIFactory createFactory1() {
        return new AndroidFactory();
    }
}
