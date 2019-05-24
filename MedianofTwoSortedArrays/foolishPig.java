package com.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class 寻找两个有序数组的中位数 {	
	static Scanner s = new Scanner(System.in);
	public static void main(String args[]) {
		double binary = 0;		//中位数
		System.out.println("请输入数组a大小及数值!");
		System.out.println("数组大小:");
		int m = s.nextInt();
		System.out.println("数组数值:");
		int[] a = constructArr(m);		//将数组初始化
		System.out.println("请输入数组b大小及数值!");
		System.out.println("数组大小:");
		int n = s.nextInt();
		System.out.println("数组数值:");
		int[] b = constructArr(n);
		ArrayList<?> als = new ArrayList<Object>();
		als = addArr(a,b);		//将数组元素存进集合
		Object[] c = als.toArray();
		Arrays.sort( c);		//对集合内元素进行排序
		if(c.length%2==1) {
			binary = (int) c[c.length/2];
		}else {
			int a1=0,b1=0;
			a1 = (int) c[c.length/2-1];
			b1 = (int) c[c.length/2];
			binary = (a1+b1)/2.0;
		}
		System.out.println(binary);
	}
	
	//将数组元素加入ArrayList集合中
	public static ArrayList <Integer>  addArr(int[] a,int[] b) {
		ArrayList <Integer> al = new ArrayList<Integer>();
		int i = 0,j = 0;
		while(i<a.length) {
			al.add(a[i]);
			i++;
		}
		while(j<b.length) {
			al.add(b[j]);
			j++;
		}
		return al;
	}
	
	//循环初始化数组
	public static int[] constructArr(int x) {
		int[] arr = new int[x];
		for(int i=0;i<x;i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
}
