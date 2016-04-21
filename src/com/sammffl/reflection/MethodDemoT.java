package com.sammffl.reflection;

import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * Created by SamMFFL on 2016/4/21.
 */
public class MethodDemoT {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        ArrayList<String> list1 = new ArrayList<String>();

        list.add("hello");
//        list1.add(20);
        Class c1 = list.getClass();
        Class c2 = list1.getClass();
        System.out.println(c1 == c2);

        //反射的操作都是编译之后的操作

        /*
         * c1==c2结果返回true说明编译之后集合的泛型是去泛型化的
         * java中集合的泛型，是防止错误输入的，只在编译阶段有效
         * 绕过编译就无效了
         * 验证：我们可以通过方法的反射操作，绕过编译
         */

        try {
            Method m = c2.getMethod("add", Object.class);
            m.invoke(list1,100);//绕过了泛型
            System.out.println(list1);
            System.out.println(list1.size());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
