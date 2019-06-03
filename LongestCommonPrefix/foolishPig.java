package com.LeetCode;

public class foolishPig {

	public static void main(String[] args) {
		String[] s = {"flower","flow","flight"};
		System.out.println(serch(s));
	}
	
	public static String serch(String[] s) {
		String str = "";
		int i = 0,index = 0;
		if(s.length==0)		//当数组长度为0时,结果为空
			return str;
		else if(s.length==1)		//当数组长度为1时,结果为它本身
			return s[0];
		int x = s[0].length(),y=0;
		for(int j=1;j<s.length;j++) {		//找出数组中长度最小的字符串
			if(x>s[j].length()) {
				x = s[j].length();
				y = j;
			}
		}
		while(index<x) {
			while(i<s.length-1&&index<s[i].length()){		//保证数组不越界且不超出字符串的长度
				if(s[i].charAt(index)==s[i+1].charAt(index))
					i++;
				else
					break;
			}
			if(i==s.length-1) {		//如果全部遍历过全部的字符串,则此时index之前的子字符串符合要求
				i = 0;
				index++;
				str = s[y].substring(0, index);
			}else {
				break;
			}
		}
		if(i==0&&index==0)		//如果数组和字符串的位置均没变,则结果为空
			str = "";
		return str; 
	}
}
