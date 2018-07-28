package com.coderbyte;

import java.util.Scanner;

class Main {
        public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        KaprekarsConstant k = new KaprekarsConstant();
        String t = KaprekarsConstant.validate(9831);
        System.out.print(t);
    }
}