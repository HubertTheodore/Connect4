package com.company;

public class Board
{
    Coin[][] A = new Coin[7][6];

    void InitBoard()
    {
        for(int i = 0;i<A.length;i++)
        {
            for(int j = 0;j<A[0].length;j++)
            {
                A[i][j] = null;
            }
        }
    }

    void InsertCoin(int column)
    {
        for (int i = A.length-1; i > 0; i--) {
            if(A[i][column] == null)
            {
                A[i][column] = new Coin();
            }
        }
    }

    void DisplayBoard()
    {
        for(int i = 0;i<A.length;i++)
        {
            for(int j = 0;j<A[0].length;j++)
            {
                System.out.print("0");
            }
            System.out.println();
        }
    }
}
