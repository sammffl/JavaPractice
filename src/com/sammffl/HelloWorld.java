package com.sammffl;

/**
 * Created by SamMFFL on 2016/4/13.
 */
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("I love imooc!");

        Telephone telephone = new Telephone(5.0f, 1.4f, 2.0f);
        System.out.println(telephone.getMem());
    }
}
