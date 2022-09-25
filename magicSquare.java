# Java
For Practice

/*
input : Give an odd number: 3
output: 8 1 6 
        3 5 7 
        4 9 2
*/

#java

import java.util.*;
public class Main
{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Give an odd number: ");
        int n = in.nextInt();
        int[][] magicSquare = new int[n][n];
        int number = 1,row = 0,column = n / 2,curr_row,curr_col;
        while (number <= n * n) {
            magicSquare[row][column] = number;
            number++;
            curr_row = row;
            curr_col = column;
            row -= 1;
            column += 1;
            if (row == -1) {
                row = n - 1;
            }
            if (column == n) {
                column = 0;
            }
            if (magicSquare[row][column] != 0) {
                row = curr_row + 1;
                column = curr_col;
                if (row == -1) {
                    row = n - 1;
                }
            }
        }
        for (int i = 0; i < magicSquare.length; i++) {
            for (int j = 0; j < magicSquare.length; j++) {
                System.out.print(magicSquare[i][j] + " ");
            }
            System.out.println();
        }
    }
}
