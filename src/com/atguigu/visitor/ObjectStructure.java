package com.atguigu.visitor;

import java.util.ArrayList;
import java.util.List;

public class ObjectStructure {
    private List<Person> persons = new ArrayList<>();

    public void attach(Person p) {
        persons.add(p);
    }

    public void detach(Person p) {
        persons.remove(p);
    }

    public void display(Action action) {
        for (Person p : persons) {
            p.accept(action);
        }
    }
}
