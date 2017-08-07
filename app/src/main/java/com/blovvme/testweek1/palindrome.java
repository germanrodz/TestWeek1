package com.blovvme.testweek1;

import java.util.Scanner;

/**
 * Created by Blovvme on 8/7/17.
 */

public class palindrome {

    public static void main(String[] args) {


            String original, reverse = "";
            Scanner in = new Scanner(System.in);

            System.out.println("Enter palindrome");
            original = in.nextLine();

            int length = original.length();

            for ( int i = length - 1; i >= 0; i-- )
                reverse = reverse + original.charAt(i);

            if (original.equals(reverse))
                System.out.println("palindrome.");
            else
                System.out.println("not a palindrome.");

        }


}
