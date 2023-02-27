package com.atguigu.prototype.deepcopy;

import java.io.*;

public class Person implements Cloneable {
    String name;
    int age;
    Friend friend;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;

    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person deep = (Person) super.clone();
        deep.friend = (Friend) friend.clone();
        return deep;
    }

    public Object deepClone() {
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;

        try {
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);

            oos.writeObject(this);

            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            Person person = (Person) ois.readObject();
            return person;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}
