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

    public Integer largest() {
        Integer max = arrayList.get(0).intValue();
        for (int i = 0; i < arrayList.size();i++) {
            if (max.intValue() < arrayList.get(i).intValue()) {
                max = arrayList.get(i).intValue();
            }
        }
        return max;
    }

    public Integer smallest() {
        Integer min = arrayList.get(0).intValue();
        for (int i = 0; i < arrayList.size();i++) {
            if (min.intValue() > arrayList.get(i).intValue()) {
                min = arrayList.get(i).intValue();
            }
        }
        return min;
    }

}
