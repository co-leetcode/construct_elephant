package com.LeetCode;

import java.util.Scanner;

public class foolishPig {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter the string:");
		System.out.println(find(s.next()));
	}
	//�������ַ����в���������Ӵ�
	public static String find(String s) {
		String s1 = null;
		if(s.length()==1||s.length()==2)
			return s1;
		else {
			char[] ch = s.toCharArray();
			int L = 0;		//���崰�ڵĴ�С
			int R = L+2;
			int i = L;		//��ʼ�����ڻ����ķ�Χ
			int j = R;
			while((R-L)<ch.length) {			//���ƴ��ڵĴ�С,ʼ��С�������С(��֤Ϊ�Ӵ�)
				 i = L;
				 j = R;
				while(j<ch.length) {		//���ô��ڻ������鷶Χ
					if(judge(s.substring(i, j))) {
						s1 = s.substring(i,j);
					}
					i++;		//�����������ƶ�
					j++;
				}
				R++;		//�ı䴰�ڴ�С
			}
			return s1;
		}
	}
	//�ж������ַ����Ƿ�Ϊ�����Ӵ�
	public static boolean judge(String s) {
		char[] ch = s.toCharArray();
		int i = 0;
		int j = ch.length-1;
		while(i<=j) {		//���ݶ���,���������߿�ʼ�Ƚ�,��ȫ�������Ϊ�����Ӵ�
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
