package com.LeetCode;

import java.util.Scanner;
import java.util.Stack;

public class foolishPig {

	public static void main(String[] args) {
		System.out.println("请输入字符串");
		Scanner s = new Scanner(System.in);
		//next方法和nextLine方法的区别在于next遇到第一个结束符(空格或换行)时结束扫描
		//nextLine方法可扫描一整行的字符串
		System.out.println(isValid(s.next()));
	}

	public static boolean isValid(String s) {
		Stack<Character> stack = new Stack<>();		//创建栈
		for(int i = 0;i<s.length();i++) {
			if(s.charAt(i)=='('||s.charAt(i)=='['||s.charAt(i)=='{')	//为左括号则进栈
				stack.push(s.charAt(i));
			else {		
				if(stack.isEmpty())		//为右括号且栈为空(即栈中无左括号)则无效
					return false;
				char ch = stack.pop();		//将栈顶字符弹出
				//与当前右括号进行匹配,匹配失败则无效
				if(ch!='('&&s.charAt(i)==')')		
					return false;
				if(ch!='['&&s.charAt(i)==']')
					return false;
				if(ch!='{'&&s.charAt(i)=='}')
					return false;
			}
		}
		return stack.isEmpty();		//当栈中所有字符都弹出(即匹配成功)
	}
}
