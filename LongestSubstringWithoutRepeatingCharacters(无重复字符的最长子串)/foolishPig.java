package com.LeetCode;

import java.util.HashSet;
import java.util.Scanner;

public class fooishPig{

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		int length = 0,left = 0,right = 0;
		HashSet hs = new HashSet();
		while(right<str.length()) {
			if(!hs.contains(str.charAt(right))) {
				hs.add(str.charAt(right));
				right++;
				length = Math.max(length,hs.size());
			}else {
				hs.remove(str.charAt(left));
				left++;
			}
		}
		System.out.println(length);
	}
}
