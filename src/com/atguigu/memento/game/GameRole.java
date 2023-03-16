package com.atguigu.memento.game;

public class GameRole {
    int atk;
    int def;

    public Memento createMemento() {
        return new Memento(atk, def);
    }

    public void recoverGameRoleFromMemento(Memento memento) {
        this.atk = memento.getAtk();
        this.def = memento.getDef();
    }

    public void display() {
        System.out.println("游戏角色攻击力： " + this.atk  + "   游戏角色防御力： " + this.def);
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }
}
