package com.atguigu.memento;

public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();
        originator.setState("状态1 攻击力100");
        Memento memento = originator.saveStateMemento();
        caretaker.add(memento);
        System.out.println("当前状态： "+ originator.getState());


        originator.setState("状态2 攻击力80");
        Memento memento2 = originator.saveStateMemento();
        caretaker.add(memento2);
        System.out.println("当前状态： "+ originator.getState());


        originator.setState("状态3 攻击力50");
        Memento memento3 = originator.saveStateMemento();
        caretaker.add(memento3);
        System.out.println("当前状态： "+ originator.getState());


        Memento recoverMemento1 = caretaker.get(0);
        originator.getStateFromMemento(recoverMemento1);
        System.out.println("喝药水恢复状态...");
        System.out.println("恢复状态： " + originator.getState());
    }
}
