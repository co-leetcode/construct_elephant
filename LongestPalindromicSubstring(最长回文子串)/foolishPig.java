package com.LeetCode;

import java.util.Scanner;

public class foolishPig {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter the string:");
		System.out.println(find(s.next()));
	}
	//从所给字符串中查找最长回文子串
	public static String find(String s) {
		String s1 = null;
		if(s.length()==1||s.length()==2)
			return s1;
		else {
			char[] ch = s.toCharArray();
			int L = 0;		//定义窗口的大小
			int R = L+2;
			int i = L;		//初始化窗口滑动的范围
			int j = R;
			while((R-L)<ch.length) {			//控制窗口的大小,始终小于数组大小(保证为子串)
				 i = L;
				 j = R;
				while(j<ch.length) {		//不让窗口滑出数组范围
					if(judge(s.substring(i, j))) {
						s1 = s.substring(i,j);
					}
					i++;		//将窗口向右移动
					j++;
				}
				R++;		//改变窗口大小
			}
			return s1;
		}
	}
	//判断所给字符串是否为回文子串
	public static boolean judge(String s) {
		char[] ch = s.toCharArray();
		int i = 0;
		int j = ch.length-1;
		while(i<=j) {		//根据定义,从数组两边开始比较,若全部相等则为回文子串
			if(ch[i]==ch[j]) {
				i++;
				j--;
			}
			else
				return false;
		}
		return true;
	}
}
