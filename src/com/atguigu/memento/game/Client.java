package com.atguigu.memento.game;

public class Client {
    public static void main(String[] args) {
        GameRole gameRole = new GameRole();
        gameRole.setAtk(100);
        gameRole.setDef(90);
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(gameRole.createMemento());

        System.out.println(" ----  打怪前状态 -------");
        gameRole.display();

        System.out.println(" ----  打怪后状态 -------");


        gameRole.setAtk(50);
        gameRole.setDef(20);

        gameRole.display();

        System.out.println(" ----  使用恢复药水 -------");


        gameRole.recoverGameRoleFromMemento(caretaker.getMemento());
        gameRole.display();





    }
}
