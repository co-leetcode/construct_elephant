package com.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ѱ�����������������λ�� {	
	static Scanner s = new Scanner(System.in);
	public static void main(String args[]) {
		double binary = 0;		//��λ��
		System.out.println("����������a��С����ֵ!");
		System.out.println("�����С:");
		int m = s.nextInt();
		System.out.println("������ֵ:");
		int[] a = constructArr(m);		//�������ʼ��
		System.out.println("����������b��С����ֵ!");
		System.out.println("�����С:");
		int n = s.nextInt();
		System.out.println("������ֵ:");
		int[] b = constructArr(n);
		ArrayList<?> als = new ArrayList<Object>();
		als = addArr(a,b);		//������Ԫ�ش������
		Object[] c = als.toArray();
		Arrays.sort( c);		//�Լ�����Ԫ�ؽ�������
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
	
	//������Ԫ�ؼ���ArrayList������
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
	
	//ѭ����ʼ������
	public static int[] constructArr(int x) {
		int[] arr = new int[x];
		for(int i=0;i<x;i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
}
