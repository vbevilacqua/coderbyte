package com.coderbyte;

import java.util.Arrays;
import java.util.Collections;

public class KaprekarsConstant {
    public static String validate(int num) {
        String[] array = intToStringArray(num);
        Integer asc = 0;
        Integer desc = 0;
        Integer counter = 0;

        while(!isEqualsTo6174(asc, desc)){
            asc = orderArrayToInt(array, true);
            desc = orderArrayToInt(array, false);
            int t = desc - asc;
            array = intToStringArray(t);
            counter++;
        }

        return String.valueOf(counter);
    }

    private static boolean isEqualsTo6174(Integer asc, Integer desc){
        int t = desc - asc;
        return t == 6174;
    }

    private static Integer orderArrayToInt (String[] array, boolean isAsc){
        if(isAsc)
            Arrays.sort(array);
        else
            Arrays.sort(array, Collections.reverseOrder());

        String number = "";
        for (String s : array) number += s;
        return Integer.valueOf(number);
    }

    private static String[] intToStringArray(int num){
        String s = String.valueOf(num);
        if(s.length() == 3)
            s += "0";
        String[] array = new String[s.length()];

        for(int i = 0; i < s.length(); i++){
            String temp = String.valueOf(s.charAt(i));
            array[i] = temp;
        }
        return array;
    }
}
