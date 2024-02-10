package org.example.task1.task2;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[] arr = {3,2,10,4,3};
        Map<Integer,Integer> map = new HashMap<>();
        boolean bl=false;
        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])){
                bl=true;
                break;
            }
            map.put(arr[i],1);

        }
        System.out.println(bl);

    }
}
