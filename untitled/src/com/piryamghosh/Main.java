package com.piryamghosh;

import java.text.NumberFormat;
import java.util.Date;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        String messages = "Hello world" + "!!";



        System.out.println(messages.endsWith("!!"));
        Date now = new Date();
        System.out.println(now);

        long num = 1000;
        System.out.println(num*num*num*num);

        double results = (double) 10 / (double) 3;
        System.out.println(results);
        

// byte>short>int>long> float>double
        double a = 100.0;
        double b = 100.0;
        int product = (int)a * (int)b;
        System.out.println(product);


        NumberFormat percent = NumberFormat.getPercentInstance();
        String result = percent.format(123456678.323);
        System.out.println(result);

        Scanner scanner =  new Scanner(System.in);
        byte age = scanner.nextByte();
        age*=5;
        age+=10;
        age/=2;
        System.out.println("You are " + age);

        String Oddnum= " ";
        for (int i = 1; i<=9; i+=2){
            Oddnum+= i + "";

        }
        System.out.println(Oddnum.trim());










    }









    }

