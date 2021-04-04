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

    public Double largest() {
        Double max = arrayList.get(0).doubleValue();
        for (int i = 0; i < arrayList.size();i++) {
            if (max.doubleValue() < arrayList.get(i).doubleValue()) {
                max = arrayList.get(i).doubleValue();
            }
        }
        return max;
    }

    public Double smallest() {
        Double min = arrayList.get(0).doubleValue();
        for (int i = 0; i < arrayList.size();i++) {
            if (min.doubleValue() > arrayList.get(i).doubleValue()) {
                min = arrayList.get(i).doubleValue();
            }
        }
        return min;
    }

}
