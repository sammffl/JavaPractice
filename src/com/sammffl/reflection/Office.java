package com.sammffl.reflection;

/**
 * Created by Administrator on 2016/4/21.
 */
public class Office {
    public static void main(String[] args) {
        try {
            //通过字符串获取类类型class type
            Class c = Class.forName(args[0]);
            //通过newInstance方法得到具体实例 强转成接口类型，实现多态
            //最终实现动态加载类
            OfficeAble office = (OfficeAble) c.newInstance();
            office.start();

        } catch (Exception e) {
            e.printStackTrace();
        }

        //获取类类型的三种方法
        //1.通过类名获得
        Class c1 = Work.class;

        //2.通过类对象getClass获得
        Work work = new Work();
        Class c2 = work.getClass();

        //3.字符串Class.forName
        Class c3 = null;
        try {
            c3 = Class.forName("com.sammffl.reflection.Work");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Work work_reflect = null;
        try {
            work_reflect = (Work) c3.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }



        work_reflect.start();
        System.out.println(c1);

    }
}
