package com.LeetCode;

import java.util.Scanner;

public class foolishPig {

	public static void main(String[] args) {
		System.out.println("�����������ַ���:");
		Scanner s = new Scanner(System.in);
		String s1 = s.next();
		String s2 = s.next();
		System.out.println(judge(s1,s2));
	}
	
	public static boolean judge(String s1,String s2) 
	{
		System.out.println(s2);
		int i = 0,j = 0;
		int m = 0,n =0;
		boolean bl = false;
		if(s1.equals(s2)||s2.endsWith(".*"))		//�����ַ������(��Ȼ��Ϊ��)����ģʽS2��.*��β�����ƥ��
			bl = true;
		else if((s1.equals("")||s1.length()==1)&&s2.equals("."))
			bl = true;
		else 
		{
			while(i<s2.length()+1) 
			{
					m = s2.indexOf(s1.charAt(0),i);	//��ȡs1��ͷ�ַ���s2�д�λ��i���ֵ�λ��
					n = s2.indexOf(".",i);	//��ȡ�ַ�.��s2�д�λ��i���ֵ�λ��
					if(m>=0&&m<s2.length()-1&&n>=0&&n<s2.length()-1)
					{
						while(j<s1.length()-1) 
						{
							if(s1.charAt(j)==s1.charAt(j+1)) 	//���ַ���s1��һ���ַ���ͬʱ���ж�
							{		
								//���ַ���s1�����ַ���ͷ	
								if(s2.charAt(m+1)==s2.charAt(m)||s2.charAt(m+1)=='.'||s2.charAt(m+1)=='*') 
								{
									bl = true;
									m++;
								}
								else
									bl = false;
								//���ַ�.��ͷ
								if(bl)
									bl = true;
								else
								{
									if(s2.charAt(n+1)==s2.charAt(n)||s2.charAt(n+1)=='.'||s2.charAt(n+1)=='*')
										bl = true;
									else
										bl = false;
								}
							}
							else //���ַ���s1��һ���ַ���ͬʱ���ж�
							{		
								if(s2.charAt(m+1)==s1.charAt(j+1)||s2.charAt(m+1)=='.') 
								{
									bl = true;
									m++;
								}
								else if(s2.charAt(m+1)==s1.charAt(j+1)||s2.charAt(m+1)=='.'||s2.charAt(n+1)=='*') 
								{
									bl = true;
									m++;
								}
								else 
									bl = false;  		
							}	
						}
						j++;
					}
					if(m>=0&&m<s2.length()-1&&n==-1) 
					{
						if(s2.charAt(m+1)==s1.charAt(j+1)||s2.charAt(m+1)=='*')
						{
							bl = true;
						    m++;
						}
						else
							bl = false;
					}
					i++;
				}
			}
		return bl;
	}
}
