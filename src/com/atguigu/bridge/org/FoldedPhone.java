package com.atguigu.bridge.org;

public class FoldedPhone extends Phone{
    public FoldedPhone(Brand brand) {
        super(brand);
    }

    public void open() {
        super.open();
        System.out.println("folded phone");
    }

    public void close() {
        super.close();
        System.out.println("folded phone");
    }

    public void call() {
        super.call();
        System.out.println("folded phone");
    }
}
