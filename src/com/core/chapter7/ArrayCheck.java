package com.core.chapter7;

public class ArrayCheck {

    static String string = "This is a test";
    static char[] chars = string.toCharArray();

    public static void main(String[] args){
        if(chars.length > 0){
            for(char c: chars){
                System.out.print(c);
            }
        }
    }

}
