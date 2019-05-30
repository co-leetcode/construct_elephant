package com.LeetCode;

import java.util.Scanner;

public class foolishPig {

	public static void main(String[] args) {
		System.out.println("ÇëÊäÈëÕûÊı:");
		Scanner s = new Scanner(System.in);
		System.out.println(reserve(s.nextInt()));
	}

	public static int reserve(int a) {
		boolean bl = true;
		if(a<0)
		{
			a = -a;
			bl = false;
		}
		int b=0,c = 0;
		while(a>0)
		{
				b = a%10;
				c = c*10+b;
				a = a/10;
		}
		if(bl)
			return c;
		else
			return -c;
	}
}
