package com.LeetCode;

import java.util.Scanner;

public class foolishPig {

	public static void main(String[] args) {
		System.out.println("请输入将要转换的罗马数字!");
		Scanner s = new Scanner(System.in);
		System.out.println(change(s.next()));
	}
	
	public static int change(String str) {
		//将所有罗马数字包含的字符串按顺序存储到字符串数组中,将其所对应的整数值按顺序存储
		String[] s = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
		int sInt[] = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
		int value = 0,i = 0;
		while(i<str.length()) {		//从罗马数字的最高位开始进行判断
			for(int j=0;j<s.length;j++) {
				//判断需要两位字符组合表示的罗马数字
				if(str.length()>1&&i<str.length()-1&&s[j].equals(str.substring(i, i+2))) {
					value = value+sInt[j];
					i+=2;
					break;
				}	
				//判断单独的一位罗马数字
				if(s[j].equals(str.substring(i, i+1))) {
					value = value+sInt[j];
					i++;
					break;
				}	
			}	
		}
		return value;
	}
}
