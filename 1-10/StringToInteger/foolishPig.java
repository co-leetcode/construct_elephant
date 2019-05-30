package com.LeetCode;

import java.math.BigInteger;
import java.util.Scanner;

public class foolishPig {

	public static void main(String[] args) {
		System.out.println("请输入字符串");
		Scanner s =new Scanner(System.in);
		String value = atoi(s.nextLine());		//返回全为数字的字符串
		BigInteger big = new BigInteger(value);		//将字符串转换为数字
		System.out.println(judge(big.longValue()));			//此时big是一个BigInteger对象,所以转换成数字long(防止int数值过大而产生异常)
	}
	//将字符串转换为数字
	public static String atoi(String s) {
		char[] ch =s.toCharArray(); 
		int i = 0,j = 0;
		if((ch[0]>=65&&ch[0]<=122)||s==null||s.isEmpty())		//将字符串头字符为字母或字符串为空的不进行转换
			return "0";
		else {
			while(ch[i]==' '&&i<ch.length)		//记录第一个不为空的字符的位置
				i++;
			j = i;
			if(ch[j]==45||ch[j]==43||(ch[j]>=48&&ch[j]<=57)) {		//记录以正负号或者数字开头的连续的数字
				while(j<ch.length) {	
					j++;
					if(j<ch.length&&!(ch[j]>=48&&ch[j]<=57))		//中途再碰到非数字就停止记录
						return s.substring(i, j);
				}
			}
		}
		return s.substring(i, j);
	}
	//判断数字大小是否超出范围
	public static long judge(long l) {
		int INT_MAX = 2147483647;	
		int INT_MIN = -2147483648;
		if(l>INT_MAX)
			return INT_MAX;
		else if(l<INT_MIN)
			return INT_MIN;
		else 
			return l;
	}
}
