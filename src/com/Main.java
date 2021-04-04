package com;

public class Main {

    public static void main(String[] args) {
        MyList<Float> ob1 = new MyList<>();
        ob1.add(8f);
        ob1.add(22f);
        ob1.add(43f);
        ob1.add(12f);
        ob1.add(3f);

        System.out.println(ob1);
        System.out.println(ob1.largest());
        System.out.println(ob1.smallest());

        MyList<Double> ob2 = new MyList<>();
        ob2.add(-10.0);
        ob2.add(2.0);
        ob2.add(56.0);
        ob2.add(12.8);
        ob2.add(3.0);

        System.out.println(ob2);
        System.out.println(ob2.largest());
        System.out.println(ob2.smallest());

        MyList<Integer> ob3 = new MyList<>();
        ob3.add(-3);
        ob3.add(0);
        ob3.add(5);


        System.out.println(ob3);
        System.out.println(ob3.largest());
        System.out.println(ob3.smallest());



    }
}
