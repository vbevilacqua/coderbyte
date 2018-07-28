package com.coderbyte;

public class ChessboardTraveling {
    public int countMoves(String positions) {
        positions = positions.replaceAll("\\D+", "");
        int row = Integer.valueOf(String.valueOf(positions.charAt(0)));
        int column = Integer.valueOf(String.valueOf(positions.charAt(1)));
        int arow = Integer.valueOf(String.valueOf(positions.charAt(2)));
        int acolumn = Integer.valueOf(String.valueOf(positions.charAt(3)));

        int result = numPathsRecursive(row, column, arow, acolumn);

        return result;
    }

    int numPathsRecursive(int column, int row, int X, int Y){
        if (column==X && row==Y){
            return 1;
        }
        else if (column>X || row>Y){
            return 0;
        }
        return numPathsRecursive(column+1,row,X,Y) + numPathsRecursive(column,row+1,X,Y);
    }
}
