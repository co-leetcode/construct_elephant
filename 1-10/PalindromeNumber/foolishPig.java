package com.LeetCode;

import java.util.Scanner;

public class foolishPig {

	public static void main(String[] args) {
		System.out.println("��������Ҫ�жϵ�����:");
		Scanner s = new Scanner(System.in);
		System.out.println(judge(s.nextInt()));
	}
	
	public static boolean judge(int x) {
		int y = x;
		int a = 0,b = 0;		//aΪÿ���µĸ�λ��,bΪ������������
		if(x<0)
			return false;		//�������ǻ�����
		else if(x>=0&&x<=9)
			return true;			//0-9�ǻ�����
		else {
			while(x>0) {		//���������з�ת
				a = x%10;
				b = b*10+a;
				x = x/10;
			}
			if(b==y)
				return true;
			else
				return false;
		}
	}
}
