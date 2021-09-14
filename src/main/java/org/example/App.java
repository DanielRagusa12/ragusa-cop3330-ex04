package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Daniel Ragusa
 */

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        String Noun;
        String Verb;
        String Adjective;
        String Adverb;

        System.out.print("Enter a noun: ");
        Scanner input=new Scanner(System.in);
        Noun=input.next();

        System.out.print("Enter a verb: ");
        Scanner input2=new Scanner(System.in);
        Verb=input2.next();

        System.out.print("Enter an adjective: ");
        Scanner input3=new Scanner(System.in);
        Adjective=input3.next();

        System.out.print("Enter an adverb: ");
        Scanner input4=new Scanner(System.in);
        Adverb=input4.next();

        String Final = String.format("Do you %s your %s %s %s? That's hilarious!", Verb,Adjective,Noun,Adverb);

        System.out.println(Final);
    }
}

