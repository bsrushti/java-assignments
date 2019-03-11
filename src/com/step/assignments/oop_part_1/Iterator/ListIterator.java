package com.step.assignments.oop_part_1.Iterator;

import java.util.List;
import java.util.NoSuchElementException;

public class ListIterator {
    private List list;
    private int index;

    public ListIterator(List list) {
        this.list = list;
        this.index = -1;
    }

    public boolean hasNext() {
        return index !=list.size();
    }

    public void next() {
        if (hasNext() == false) {
            throw new NoSuchElementException("my exception : NoSuchElementException");
        } else {
            System.out.println(list.get(++index));
        }
    }

}


/*
Create A class called ListIterator
    Takes a list as constructor parameter

    method hasNext() tells if there are any more elements in the list which are not yet visited
    method next()
         - gives the next element if available
         - throw new NoSuchElementException() when all elements are visited already
 */