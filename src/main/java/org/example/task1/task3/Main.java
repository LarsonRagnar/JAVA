package org.example.task1.task3;

import java.nio.charset.CharsetEncoder;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Character, Integer> num = new HashMap<>(Map.of('I',1,
                'V',5,
                'X',10,
                'L',50,
                'C',100,
                'D',500,
                'M',1000));
        String str="LVII";
        int sum=0;
        for (int i = 0; i < str.length(); i++) {
            sum+=num.get(str.charAt(i));

        }
        System.out.println("sum = " + sum);
        String str1="MCMXCIV";
        int sum1 = getSum1(num, str, str1);
        System.out.println("sum1 = " + sum1);

    }

    /**
     * @apiNote Метод принимает римские цифры и возвращает арабские
     * @param num
     * @param str
     * @param str1
     * @return Число арабскими цифрами
     */
    private static int getSum1(Map<Character, Integer> num, String str, String str1) {
        int sum1= num.get(str1.charAt(str.length()-1));
        for (int j = 0; j < str1.length() -1; j++) {
            if (num.get(str1.charAt(j)) < num.get(str1.charAt(j+1))) {
                sum1-= num.get(str1.charAt(j));

            }else {
                sum1+= num.get(str1.charAt(j));

            }

        }
        return sum1;
    }
}
