package com.demo;

class Palindrome {
	  public static void main(String[] args) {
	    int n=151;
	    int temp=n;
	    int sum=0;
	    int rev=0;
	    while(n!=0)
	    {
	     rev=n%10;
	     sum=(sum*10)+rev;
	     n=n/10;
	     }
	    if(sum==temp)
	    {
	    System.out.println("Its a Palindrome");
	    }
	    else
	    {
	    System.out.println("Its not a Palindrome");
	    }
	  }
	}
