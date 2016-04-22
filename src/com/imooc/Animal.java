package com.imooc;

/**
 * Created by SamMFFL on 2016/4/22.
 */
public class Animal {
    public Animal(int i) {
        System.out.println("Animal 类执行了");
        age = 20;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public int age = 10;
    public String name;

    public void eat() {
        System.out.println("动物具有吃东西的能力");
    }
}
