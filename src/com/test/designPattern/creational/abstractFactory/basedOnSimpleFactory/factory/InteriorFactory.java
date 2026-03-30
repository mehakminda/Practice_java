package com.test.designPattern.creational.abstractFactory.basedOnSimpleFactory.factory;

import com.test.designPattern.creational.abstractFactory.basedOnSimpleFactory.component.CarInterior;
import com.test.designPattern.creational.abstractFactory.basedOnSimpleFactory.component.EconomyInterior;
import com.test.designPattern.creational.abstractFactory.basedOnSimpleFactory.component.LuxuryInterior;

public class InteriorFactory {
    public static CarInterior getInterior(String type){
        if(type.equals("economy")){
            return new EconomyInterior();
        }
        else if(type.equals("luxury")){
            return new LuxuryInterior();
        }
        else{
            return null;
        }
    }
}
