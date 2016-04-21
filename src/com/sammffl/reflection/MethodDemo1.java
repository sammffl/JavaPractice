package com.sammffl.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by SamMFFL on 2016/4/21.
 */
public class MethodDemo1 {
    public static void main(String[] args) {
        //要获取print(int,int)方法
        // 1。要获取一个方法就是获取类的信息，获取类的信息首先要获取类的类类型

        A a1 = new A();
        Class c = a1.getClass();



        /*
         * 2.获取方法 名称好参数列表
         * getMethod获取的是public的方法
         * getDeclaredMethod
         */
        try {
//            Class c = Class.forName("com.sammffl.reflection.A");
//            Foo foo = (Foo) c.newInstance();
            Method m = c.getMethod("print", int.class, int.class);
//          Method m=  c.getMethod("print",new Class[]{int.class,int.class});
            //方法的反射操作
            //方法的反射操作使用m对象来进行方法调用 和a1.print调用的效果完全相同
            Object o = m.invoke(a1, new Object[]{10, 20});
            System.out.println("================");
            Method m1 = c.getMethod("print", String.class, String.class);
            Object o1 = m1.invoke(a1, "hello", "WORLD");
            System.out.println("================");
            Method m2 = c.getMethod("print");
            m2.invoke(a1);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

interface Foo {

}

class A implements Foo {
    public void print(){}

    public void print(int a, int b) {
        System.out.println(a + b);
    }

    public void print(String a, String b) {
        System.out.println(a.toUpperCase() + "," + b.toLowerCase());
    }
}
