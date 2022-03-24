package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task1Day2 {

    public static void main(String[] args){

        int number1,number2;
        Scanner input = new Scanner(System.in);
        System.out.println("Input number 1");
        number1=input.nextInt();

        System.out.println("Input number 2");
        number2=input.nextInt();

        if(number1==number2){
            System.out.println("is "+number1 +" equal to "+number2+"? - True");  ;
        }else
            System.out.println("is "+number1+ " equal to "+number2+"? - false");

        if(number1<number2){
            System.out.println("is "+number1+ " less than "+number2+"? - true") ;
        }else System.out.println("is "+number1+" less than "+number2+"? - false");

        if(number1<=number2){
            System.out.println("is "+number1+ " less or equal to "+number2+"? - True");
        }else
            System.out.println("is "+number1+ " less or equal to "+number2+"? - false");

        if(number1>number2){
            System.out.println("is "+number1+" greater than "+number2+"? - true");
        }else System.out.println("is "+number1+" greater than "+number2+"? - false");

        if(number1>=number2){
            System.out.println("is "+number1+" greater or equal to "+number2+"? - True");
        }else
            System.out.println("is "+number1+" greater or equal to "+number2+"? - false");


        //TASK 2

        System.out.print("Enter b1:");
        boolean b1= input.nextBoolean();

        System.out.print("Enter b2:");
        boolean b2= input.nextBoolean();

        System.out.print("Is b1 and b2 equal? - ");

        if(b1==b2){
            System.out.println("true");
        }else System.out.println("false");

        //Task 3

        System.out.println("Enter number to check if it's even:");
        int value = input.nextInt();
        System.out.println("Is " + value + " even? - " + (value % 2 == 0 ? "true" : "false"));

        //TASK 4
        System.out.println("Enter number to check if it's odd:");
        int value1 = input.nextInt();
        System.out.println("Is " + value1 + " odd? - " + (value1 % 2 != 0 ? "true" : "false"));

        //TASK 5
        System.out.println("Enter boolean to invert:");
        boolean value2 = input.nextBoolean();
        System.out.println("Opposite of "+ value2 + " is - " + !value2);

        //TASK 6

        System.out.println("Enter first number for checks:");
        int valueA = input.nextInt();
        System.out.println("Enter second number for checks:");
        int valueB =input.nextInt();
        System.out.println("Is numbers " + valueA + " and " + valueB + " passed? - " + (valueA != valueB && (valueA >= 0 || valueB <= 0) && (valueA <= 1001 || valueB <= 1001) ? "false" : "true"));


    }
}
