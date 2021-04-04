package com;

import java.util.ArrayList;
import java.util.Collections;

public class MyList<T extends Number> {

    ArrayList<T> arrayList = new ArrayList<>();

    @Override
    public String toString() {
        return "MyList" +
                arrayList;
    }

    public void add(T elem) {
        arrayList.add(elem);
    }

    public T smallest() {
        T min = arrayList.get(0);
        for (int i = 0; i < arrayList.size(); i++) {
            if (min.doubleValue() > arrayList.get(i).doubleValue()) {
                min = arrayList.get(i);
            }
        }
        return min;
    }


    public T largest() {
        T max = arrayList.get(0);
        for (int i = 0; i < arrayList.size(); i++) {
            if (max.doubleValue() < arrayList.get(i).doubleValue()) {
                max = arrayList.get(i);
            }
        }
        return max;
    }
}


