package com.LeetCode;

import java.util.Scanner;
import java.util.Stack;

public class foolishPig {

	public static void main(String[] args) {
		System.out.println("�������ַ���");
		Scanner s = new Scanner(System.in);
		//next������nextLine��������������next������һ��������(�ո����)ʱ����ɨ��
		//nextLine������ɨ��һ���е��ַ���
		System.out.println(isValid(s.next()));
	}

	public static boolean isValid(String s) {
		Stack<Character> stack = new Stack<>();		//����ջ
		for(int i = 0;i<s.length();i++) {
			if(s.charAt(i)=='('||s.charAt(i)=='['||s.charAt(i)=='{')	//Ϊ���������ջ
				stack.push(s.charAt(i));
			else {		
				if(stack.isEmpty())		//Ϊ��������ջΪ��(��ջ����������)����Ч
					return false;
				char ch = stack.pop();		//��ջ���ַ�����
				//�뵱ǰ�����Ž���ƥ��,ƥ��ʧ������Ч
				if(ch!='('&&s.charAt(i)==')')		
					return false;
				if(ch!='['&&s.charAt(i)==']')
					return false;
				if(ch!='{'&&s.charAt(i)=='}')
					return false;
			}
		}
		return stack.isEmpty();		//��ջ�������ַ�������(��ƥ��ɹ�)
	}
}
