package com.LeetCode;

public class foolishPig {

	public static void main(String[] args) {
		String[] s = {"flower","flow","flight"};
		System.out.println(serch(s));
	}
	
	public static String serch(String[] s) {
		String str = "";
		int i = 0,index = 0;
		if(s.length==0)		//�����鳤��Ϊ0ʱ,���Ϊ��
			return str;
		else if(s.length==1)		//�����鳤��Ϊ1ʱ,���Ϊ������
			return s[0];
		int x = s[0].length(),y=0;
		for(int j=1;j<s.length;j++) {		//�ҳ������г�����С���ַ���
			if(x>s[j].length()) {
				x = s[j].length();
				y = j;
			}
		}
		while(index<x) {
			while(i<s.length-1&&index<s[i].length()){		//��֤���鲻Խ���Ҳ������ַ����ĳ���
				if(s[i].charAt(index)==s[i+1].charAt(index))
					i++;
				else
					break;
			}
			if(i==s.length-1) {		//���ȫ��������ȫ�����ַ���,���ʱindex֮ǰ�����ַ�������Ҫ��
				i = 0;
				index++;
				str = s[y].substring(0, index);
			}else {
				break;
			}
		}
		if(i==0&&index==0)		//���������ַ�����λ�þ�û��,����Ϊ��
			str = "";
		return str; 
	}
}
