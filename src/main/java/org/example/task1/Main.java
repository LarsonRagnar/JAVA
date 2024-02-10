package org.example.task1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Character,Integer> map = new TreeMap<>();
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        for (int i = 0; i < str.length(); i++) {
            Character ch = str.charAt(i);
            map.putIfAbsent(ch,1);
            map.put(ch,map.get(ch)+1);
        }
        for (Map.Entry<Character, Integer> characterIntegerEntry : map.entrySet()) {
            System.out.println(characterIntegerEntry.getKey()+ ':'+ characterIntegerEntry.getValue());

        }
    }
}
