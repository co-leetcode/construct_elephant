package com.LeetCode;

import java.util.Scanner;

public class foolishPig {

	public static void main(String[] args) {
		System.out.println("请输入两个字符串:");
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
		if(s1.equals(s2)||s2.endsWith(".*"))		//两个字符串相等(相等或均为空)或者模式S2以.*结尾则可以匹配
			bl = true;
		else if((s1.equals("")||s1.length()==1)&&s2.equals("."))
			bl = true;
		else 
		{
			while(i<s2.length()+1) 
			{
					m = s2.indexOf(s1.charAt(0),i);	//获取s1的头字符在s2中从位置i出现的位置
					n = s2.indexOf(".",i);	//获取字符.在s2中从位置i出现的位置
					if(m>=0&&m<s2.length()-1&&n>=0&&n<s2.length()-1)
					{
						while(j<s1.length()-1) 
						{
							if(s1.charAt(j)==s1.charAt(j+1)) 	//当字符串s1下一个字符相同时的判断
							{		
								//以字符串s1的首字符开头	
								if(s2.charAt(m+1)==s2.charAt(m)||s2.charAt(m+1)=='.'||s2.charAt(m+1)=='*') 
								{
									bl = true;
									m++;
								}
								else
									bl = false;
								//以字符.开头
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
							else //当字符串s1下一个字符不同时的判断
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
