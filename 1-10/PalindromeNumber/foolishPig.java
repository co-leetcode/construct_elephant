package com.LeetCode;

import java.util.Scanner;

public class foolishPig {

	public static void main(String[] args) {
		System.out.println("请输入所要判断的整数:");
		Scanner s = new Scanner(System.in);
		System.out.println(judge(s.nextInt()));
	}
	
	public static boolean judge(int x) {
		int y = x;
		int a = 0,b = 0;		//a为每次新的个位数,b为倒序后的新整数
		if(x<0)
			return false;		//负数不是回文数
		else if(x>=0&&x<=9)
			return true;			//0-9是回文数
		else {
			while(x>0) {		//将整数进行反转
				a = x%10;
				b = b*10+a;
				x = x/10;
			}
			if(b==y)
				return true;
			else
				return false;
		}
	}
}
