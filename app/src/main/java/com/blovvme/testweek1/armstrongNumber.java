package com.blovvme.testweek1;

/**
 * Created by Blovvme on 8/7/17.
 */

public class armstrongNumber {
    public static void main(String[] args) {
        int c=0;
        int a;
        int temp;
        int n=444;
        temp=n;
        while(n>0)
        {
            a=n%10;
            n=n/10;
            c=c+(a*a*a);
        }
        if(temp==c)
            System.out.println("yes");
        else
            System.out.println("no ");
    }
}
