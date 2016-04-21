package com.sammffl.reflection;

/**
 * Created by Administrator on 2016/4/21.
 */
public class ClassDemo {
    public static void main(String[] args) {
        Class c = int.class;
        //class java.lang.String
        Class c1 = String.class;
        //double
        Class c2 = double.class;
        //class java.lang.Double
        Class c3 = Double.class;
        //void
        Class c4 = void.class;

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);


        String s = "''";
        ClassUtil.printClassMessage(s);
    }
}
