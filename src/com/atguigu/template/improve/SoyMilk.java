package com.atguigu.template.improve;

public abstract class SoyMilk {
    public void make() {
        select();
        if (isCustomerWantsCondiment()) {
            addCondiment();
        }
        soak();
        beat();
    }

    public void select(){
        System.out.println("第一步： 选择上好的黄豆");
    }

    public abstract void addCondiment();

    public void soak(){
        System.out.println("第三步： 将黄豆和配料浸泡3小时");
    }

    public void beat() {
        System.out.println("第四步： 打豆浆");
    }

    // 钩子方法，决定是否需要添加配料
    public boolean isCustomerWantsCondiment() {
        return true;
    }
}
