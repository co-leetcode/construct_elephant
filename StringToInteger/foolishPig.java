package com.LeetCode;

import java.math.BigInteger;
import java.util.Scanner;

public class foolishPig {

	public static void main(String[] args) {
		System.out.println("�������ַ���");
		Scanner s =new Scanner(System.in);
		String value = atoi(s.nextLine());		//����ȫΪ���ֵ��ַ���
		BigInteger big = new BigInteger(value);		//���ַ���ת��Ϊ����
		System.out.println(judge(big.longValue()));			//��ʱbig��һ��BigInteger����,����ת��������long(��ֹint��ֵ����������쳣)
	}
	//���ַ���ת��Ϊ����
	public static String atoi(String s) {
		char[] ch =s.toCharArray(); 
		int i = 0,j = 0;
		if((ch[0]>=65&&ch[0]<=122)||s==null||s.isEmpty())		//���ַ���ͷ�ַ�Ϊ��ĸ���ַ���Ϊ�յĲ�����ת��
			return "0";
		else {
			while(ch[i]==' '&&i<ch.length)		//��¼��һ����Ϊ�յ��ַ���λ��
				i++;
			j = i;
			if(ch[j]==45||ch[j]==43||(ch[j]>=48&&ch[j]<=57)) {		//��¼�������Ż������ֿ�ͷ������������
				while(j<ch.length) {	
					j++;
					if(j<ch.length&&!(ch[j]>=48&&ch[j]<=57))		//��;�����������־�ֹͣ��¼
						return s.substring(i, j);
				}
			}
		}
		return s.substring(i, j);
	}
	//�ж����ִ�С�Ƿ񳬳���Χ
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
