package com.imooc;

/**
 * Created by SamMFFL on 2016/4/22.
 */
public class initial {
    public static void main(String[] args) {
//        Dog dog = new Dog(1);
//        Dog dog2 = new Dog(1);
//        dog.eat();
//
//        System.out.println(dog);
//        System.out.println(dog.equals(dog2));
        Telephone telephone = new Telephone(1.6f, 4.5f, 4.7f);
        Telephone telephone2 = new Telephone(1.6f, 4.5f, 4.7f);
        System.out.println(telephone.equals(telephone2));
    }
}
