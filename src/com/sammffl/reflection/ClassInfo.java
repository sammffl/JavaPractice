package com.sammffl.reflection;

/**
 * Created by Administrator on 2016/4/21.
 */
public class ClassInfo {
    public static void main(String[] args) {
        String s = "java.lang.Object ,";
        Work work = new Work();
        ClassUtil.printClassMessage(work);
    }
}
