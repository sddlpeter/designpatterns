package com.atguigu.state.lending;

public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        context.setState(new PublishState());
        System.out.println(context.getCurrentState());

        context.acceptOrderEvent(context);
        context.payOrderEvent(context);
    }
}
