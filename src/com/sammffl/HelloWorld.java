package com.sammffl;

import com.object.*;
import com.object.second.*;

import java.util.*;

/**
 * Created by SamMFFL on 2016/4/13.
 */
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("I love imooc!");

        com.object.Telephone telephone = new com.object.Telephone(5.0f, 1.4f, 2.0f);
        com.object.second.Telephone telephone2 = new com.object.second.Telephone();
        System.out.println(telephone.getMem());
        int[] arr = {1, 2, 3, 4};
        Arrays.sort(arr);
    }
}
