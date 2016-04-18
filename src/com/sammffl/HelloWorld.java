package com.sammffl;

import com.object.*;
import com.object.second.*;

import java.util.*;

/**
 * Created by SamMFFL on 2016/4/13.
 */
public class HelloWorld {
    private  String name = "imooc";
    int age = 20;
    private static String voi = "123";

    public class Inner {
        String name = "爱慕课";

        public void show() {
            System.out.println("外部类中的name" + HelloWorld.this.name);
            System.out.println("内部类中的name：" + this.name);
            System.out.println("外部类中的age:" + age);
        }
    }

    public static class SInner {
        String name = "爱慕课";

        public void show() {
            System.out.println("外部类中的name" + HelloWorld.voi);
            System.out.println("内部类中的name：" + this.name);
        }
    }
    public static void main(String[] args) {
        System.out.println("I love imooc!");

        com.object.Telephone telephone = new com.object.Telephone(5.0f, 1.4f, 2.0f);
        com.object.second.Telephone telephone2 = new com.object.second.Telephone();
        System.out.println(telephone.getMem());
        int[] arr = {1, 2, 3, 4};
        Arrays.sort(arr);

        HelloWorld o = new HelloWorld();
        Inner inner = o.new Inner();
        inner.show();

    }
}
