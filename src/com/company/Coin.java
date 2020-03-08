package com.company;

public class Coin
{
    public String ANSI_RED = "/u001B[31m";

    public String getCoinText()
    {
        return ANSI_RED + "0";
    }
}
