package com.test.designPattern.creational.abstractFactory.basedOnSimpleFactory.factory;

import com.test.designPattern.creational.abstractFactory.basedOnSimpleFactory.component.CarExterior;
import com.test.designPattern.creational.abstractFactory.basedOnSimpleFactory.component.EconomyExterior;
import com.test.designPattern.creational.abstractFactory.basedOnSimpleFactory.component.LuxuryExterior;

public class ExteriorFactory {
    public static CarExterior getExterior(String type){
        if(type.equals("economy")){
            return new EconomyExterior();
        }
        else if(type.equals("luxury")){
            return new LuxuryExterior();
        }
        else {
            return null;
        }
    }
}
