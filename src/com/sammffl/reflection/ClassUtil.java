package com.sammffl.reflection;

/**
 * Created by Administrator on 2016/4/21.
 */
public class ClassUtil {
    /**
     * 打印类的信息，包括类的成员函数、成员变量
     * @param obj 该对象所属类的信息
     */
    public static void printClassMessage(Object obj) {
        Class c = obj.getClass();
        System.out.println("类的名称是：" + c.getName());
    }
}
