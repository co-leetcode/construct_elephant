package ţ����������;

import java.util.Scanner;

public class foolishPig1 {

	public static void main(String[] args) {
		System.out.println("��������Ҫ�任���ַ���������!");
		Scanner s = new Scanner(System.in);
		String str = s.next();
		int numRows = s.nextInt();
		convert(str,numRows);
	}

	public static void convert(String s, int numRows) {
		char[] ch = s.toCharArray();
		int length = ch.length;
		numRows+=1;
		int x = length/numRows;
		int[] arr = new int[x+1];
		arr[0] = 0;			//�и���һ����ʼ��
		arr[x] = x*numRows;			//�и�����һ����ʼ��
		int i =1;
		while(i<x) {		//��¼ÿ���и�ĵ㲢�洢��������
			arr[i] = numRows*i;
			i++;
		}
		int a = 0,b = 0;
		while(a<numRows) {
			while(b<arr.length-1) {
				System.out.print(ch[a+numRows*b]);
				b++;
			}
			//System.out.print(ch[a]+""+ch[a+numRows]+""+ch[a+numRows*2]+""+ch[a+numRows*3]);
			//System.out.print();
			//System.out.println();
			b = 0;
			a++;
		}
		while(arr[x]<length) {
			System.out.print(ch[arr[x]]);
			arr[x]++;
		}
	}
}
