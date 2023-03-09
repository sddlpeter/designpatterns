package com.atguigu.template.improve;

import com.atguigu.decorator.Soy;

public class PureSoyMilk extends SoyMilk {
    @Override
    public void addCondiment() {

    }

    @Override
    public boolean isCustomerWantsCondiment() {
        return false;
    }
}
