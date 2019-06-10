package com.LeetCode;

import java.util.Scanner;

public class foolishPig {

	public static void main(String[] args) {
		System.out.println("请输入数组的大小:");
		Scanner s = new Scanner(System.in);
		int length = s.nextInt()+1;
		int[] a = new int[length];
		for(int i=1;i<length;i++)		//从下标为1开始存储
			a[i] = s.nextInt();
		int area = 0;
		for(int i=1;i<length;i++) {
			for(int j=length-1;j>1;j--) {
				if(computeArea(i,j,a[i],a[j])>area)
					area = computeArea(i,j,a[i],a[j]);
			}
		}
		System.out.println(area);
	}

	public static int computeArea(int a,int b,int c,int d) {
		int x = a-b;		//容器的宽
		if(x<0)
			x = -x;
		int y = c>d?d:c;		//容器的高
		return x*y;
	}
}
