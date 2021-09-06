package Assignment01;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Adrian Chew
 */

import java.util.Scanner;

public class Solution03 {
    /*
    print "What is the quote?"
    'quote' = get input from user
    print "Who said it?"
    'author' = get input from user
    print 'author'+" says, \""+'quote'+"\""
     */
    public static void main(String[] args) {
        System.out.println("What is the quote?");

        Scanner input = new Scanner(System.in);
        String quote = input.nextLine();

        System.out.println("Who said it?");

        String author = input.nextLine();

        System.out.println(author+" says, \""+quote+"\"");
    }
}
