package org.example.task1.task2;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[] arr = {3,2,10,4,3};
        Map<Integer,Integer> map = new HashMap<>();
        boolean bl=false;
        bl = getFlag(arr, map, bl);
        System.out.println(bl);

    }

    private static boolean getFlag(int[] arr, Map<Integer, Integer> map, boolean bl) {
        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])){
                bl =true;
                break;
            }
            map.put(arr[i],1);

        }
        return bl;
    }
}
