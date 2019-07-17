package com.LeetCode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class foolishPig {
	public static void main(String[] args) {
		System.out.println("���������Ŷ���");
		Scanner s = new Scanner(System.in);
		List<String> al = generateParenthesis(s.nextInt());
		Iterator it = al.iterator();
		while(it.hasNext())
			System.out.println(it.next());
	}
	public static List<String> generateParenthesis(int n) {
		if(n<0)		//���Ŷ���С��0�򷵻ؿ�����
			return new ArrayList<String>();
		List<String> ls = new ArrayList<String>();
		build(ls,"",n,n);
		return ls;
    }
	//������Ч����,ʹ��List����
	public static void build(List<String> list,String str,int left,int right) {
		if(left<0||right<0)		//����������Ŀʹ�ó�֧�򷵻�
			return;
		if(left==0&&right==0)		//������������Ŀͬʱʹ�����򽫵�ǰ�ַ�������������
			list.add(str);
		if(left<=right) {			//�������õĶ�,������������Ż���������
			build(list,str+"(",left-1,right);
			build(list,str+")",left,right-1);
		}
	}
}


