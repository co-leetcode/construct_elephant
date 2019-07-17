package com.LeetCode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class foolishPig {
	public static void main(String[] args) {
		System.out.println("请输入括号对数");
		Scanner s = new Scanner(System.in);
		List<String> al = generateParenthesis(s.nextInt());
		Iterator it = al.iterator();
		while(it.hasNext())
			System.out.println(it.next());
	}
	public static List<String> generateParenthesis(int n) {
		if(n<0)		//括号对数小于0则返回空容器
			return new ArrayList<String>();
		List<String> ls = new ArrayList<String>();
		build(ls,"",n,n);
		return ls;
    }
	//创建有效括号,使用List容器
	public static void build(List<String> list,String str,int left,int right) {
		if(left<0||right<0)		//左右括号数目使用超支则返回
			return;
		if(left==0&&right==0)		//当左右括号数目同时使用完则将当前字符串存入容器中
			list.add(str);
		if(left<=right) {			//左括号用的多,则继续用左括号或者右括号
			build(list,str+"(",left-1,right);
			build(list,str+")",left,right-1);
		}
	}
}


