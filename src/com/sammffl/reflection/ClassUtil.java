package com.sammffl.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
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
        Method[] ms = c.getMethods();
//        Method[] ms = c.getDeclaredMethods();

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
            getClassFields(c);


        }
    }

    /**
     * 获取成员变量信息
     * Field类封装了关于成员变量的操作
     *
     * @param c 对象的类类型
     */
    public static void getClassFields(Class c) {

        Field[] fs = c.getFields();
//            Field[] fs  =c.getDeclaredFields();
        for (Field field : fs) {
            Class fieldType = field.getType();
            String typeName = fieldType.getName();
            String fieldName = field.getName();
            System.out.println(typeName + " " + fieldName);
        }
    }

    /**
     * 打印对象的构造函数的信息
     *
     * @param obj
     */
    public static void printConMessage(Object obj) {
        Class c = obj.getClass();
        /*
         * 构造函数也是对象
         * java.lang.Constructor中封装了构造函数的信息
         * getConstructors获取
         */
//        Constructor[] cs = c.getConstructors();
        Constructor[] cs = c.getDeclaredConstructors();
        for (Constructor constructor : cs) {
            Class[] paramTypes = constructor.getParameterTypes();
            System.out.print(constructor.getName() + "(");

            for (Class class1 : paramTypes) {
                System.out.print(class1.getName() + ",");
            }
            System.out.println(")");
        }
    }
}
