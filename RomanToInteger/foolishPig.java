package com.LeetCode;

import java.util.Scanner;

public class foolishPig {

	public static void main(String[] args) {
		System.out.println("�����뽫Ҫת������������!");
		Scanner s = new Scanner(System.in);
		System.out.println(change(s.next()));
	}
	
	public static int change(String str) {
		//�������������ְ������ַ�����˳��洢���ַ���������,��������Ӧ������ֵ��˳��洢
		String[] s = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
		int sInt[] = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
		int value = 0,i = 0;
		while(i<str.length()) {		//���������ֵ����λ��ʼ�����ж�
			for(int j=0;j<s.length;j++) {
				//�ж���Ҫ��λ�ַ���ϱ�ʾ����������
				if(str.length()>1&&i<str.length()-1&&s[j].equals(str.substring(i, i+2))) {
					value = value+sInt[j];
					i+=2;
					break;
				}	
				//�жϵ�����һλ��������
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
