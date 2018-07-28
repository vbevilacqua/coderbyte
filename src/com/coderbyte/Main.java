package com.coderbyte;

class Main {
        public static void main (String[] args) {
            ChessboardTraveling c = new ChessboardTraveling();
            String t = String.valueOf(c.countMoves("(2 2)(4 3)"));
            System.out.print(t);
    }
}