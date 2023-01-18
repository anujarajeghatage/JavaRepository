package com.programing;

public class Basics {
    public static void main(String[] args) {
        //Arrays
        int[] marks={33,44,55};
        int[][] finalmarks={{22,33,44,55},{11,22,33,44}};
        System.out.println(finalmarks[0][1]);

        //type casting=is process of converting values from one type to another type as long as types are compatable.
        //(compatable=cant convert string to numbers but can convert nubers into numbers).s
        int score=100;
        int finalscore=score+(int)11.11;//here even we write 11.11 it will only take limited data
        System.out.println(finalscore);

        //Constats=value of constants cannot be changed and is fixed using keyword final..and finals are always written in capital.
        final float PI =3.14F;//value cannot be changed entire code

        //operators
        //aeathmetic opertaors are +_*%
        double a=1;
        double b=2;
        double mod=1%2;
        System.out.println(mod);//mod will give u remender

       //math class
        System.out.println(Math.max(5,3));
        System.out.println(Math.min(2,5));
        System.out.println(Math.random());







    }
}