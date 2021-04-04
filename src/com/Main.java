package com;

public class Main {

    public static void main(String[] args) {
        MyList<Integer> ob1 = new MyList<>();
        ob1.add(-6);
        ob1.add(22);
        ob1.add(43);
        ob1.add(12);
        ob1.add(3);

        System.out.println(ob1);
        System.out.println(ob1.largest());
        System.out.println(ob1.smallest());
    }
}
