package com.company;

public class Main {

    public static int[][] board = new int[7][6];

    public static void main(String[] args)
    {// write your code here
Init(board);
    }

    public static void Init(int A[][])
    {
        for(int i = 0;i<A.length;i++)
        {
            for(int j = 0;j<A[0].length;j++)
            {
                A[i][j] = -1;
            }
        }
    }

    public static void TakeInput(int col, int num)
    {
        for (int i = 0; i < 6; i++) {
            if(board[i][col] != -1)
            {
                board[i-1][col] = num;
            }
        }
    }
}
