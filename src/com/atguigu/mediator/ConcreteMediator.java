package com.atguigu.mediator;

import java.util.HashMap;
import java.util.Map;

public class ConcreteMediator extends Mediator{
    private Map<String, Colleague> colleagueMap;
    private Map<String, String> interMap;

    public ConcreteMediator() {
        this.colleagueMap = new HashMap<>();
        this.interMap = new HashMap<>();
    }

    @Override
    public void register(String name, Colleague colleague) {
        colleagueMap.put(name, colleague);
        if (colleague instanceof Alarm) {
            interMap.put("Alarm", name);
        } else if (colleague instanceof CoffeeMachine) {
            interMap.put("CoffeeMachine", name);
        } else if (colleague instanceof Tv) {
            interMap.put("Tv", name);
        } else if (colleague instanceof Curtains) {
            interMap.put("Curtains", name);
        }
    }

    @Override
    public void getMessage(int stateChange, String name) {
        if (colleagueMap.get(name) instanceof Alarm) {
            if (stateChange == 0) {
                ((CoffeeMachine) colleagueMap.get(interMap.get("CoffeeMachine"))).startCoffee();
                ((Tv) colleagueMap.get(interMap.get("Tv"))).startTv();
            } else if (stateChange == 1) {
                ((Tv) colleagueMap.get(interMap.get("Tv"))).stopTv();
            }
        } else if (colleagueMap.get(name) instanceof CoffeeMachine) {
            ((Curtains) colleagueMap.get(interMap.get("Curtains"))).upCurtains();
        } else if (colleagueMap.get(name) instanceof Tv) {

        } else if (colleagueMap.get(name) instanceof Curtains) {

        }
    }

    @Override
    public void sendMessage() {

    }
}
