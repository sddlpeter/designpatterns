package com.atguigu.iterator;

import java.util.Iterator;

public class ComputerCollegeIterator implements Iterator {
    Department[] departments;
    int position = 0;

    public ComputerCollegeIterator(Department[] departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        if (position >= departments.length || departments[position] == null) {
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        return departments[position++];
    }

    public void remove() {

    }
}
