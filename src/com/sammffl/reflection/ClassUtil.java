package com.sammffl.reflection;

import java.lang.reflect.Method;

/**
 * Created by Administrator on 2016/4/21.
 */
public class ClassUtil {
    /**
     * 打印类的信息，包括类的成员函数、成员变量
     *
     * @param obj 该对象所属类的信息
     */
    public static void printClassMessage(Object obj) {
        Class c = obj.getClass();
        System.out.println("类的名称是：" + c.getName());
        /**
         * Method类，方法对象
         * getMethod()获取public方法
         * getDeclaredMethod()获取所有声明方法
         */
//        Method[] ms = c.getMethods();
        Method[] ms = c.getDeclaredMethods();

        for (int i = 0; i < ms.length; i++) {
            //获取方法的返回值类型
            Class returnType = ms[i].getReturnType();
            //获取方法名
            String methodName = ms[i].getName();

            Class[] paramTypes = ms[i].getParameterTypes();
            String params = "";
            for (int j = 0; j < paramTypes.length; j++) {
                params += paramTypes[j].getName() + " ,";
            }

            System.out.println(String.format("%s %s(%s)",
                    returnType,
                    methodName,
                    params));
        }
    }
}
