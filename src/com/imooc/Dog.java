package com.imooc;

/**
 * Created by SamMFFL on 2016/4/22.
 */
public class Dog extends Animal {

    public Dog(int i) {
        super(i);
        System.out.println("dog 类执行了");
        System.out.println(age);

    }

    public int nums = 11;

    @Override
    public String toString() {
        return "Dog{" +
                "nums=" + nums +
                '}';
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("狗吃东西");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o  ==null || getClass() != o.getClass()) return false;

        Dog dog = (Dog) o;

        return nums == dog.nums;

    }

    @Override
    public int hashCode() {
        return nums;
    }
}
