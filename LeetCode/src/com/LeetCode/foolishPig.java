package com.LeetCode;

import java.util.Arrays;
import java.util.Scanner;

public class foolishPig {
	public static void main(String[] args) {
		int[] arr = new int[10];
		Scanner s = new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			arr[i] = s.nextInt();
		}
		int key = s.nextInt();
		Arrays.sort(arr);
		if(!find(arr,key))
			System.out.println("不存在两数和为"+key);
	}
	
	public static boolean find(int[] arr,int key) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if((arr[i]+arr[j])==key) {
					System.out.println("存在两数和为"+key+",角标为"+i+"和"+j);
					return true;
				}	
			}
		}
		return false;
	}
}
