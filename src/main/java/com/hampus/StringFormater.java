package com.hampus;

public class StringFormater
{
    public String toNameFormat(String input){
        return input.substring(0,1).toUpperCase() + input.substring(1).toLowerCase();
    }
}
