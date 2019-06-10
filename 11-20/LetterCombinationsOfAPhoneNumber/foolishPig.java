package com.LeetCode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class foolishPig {

	public static void main(String[] args) {
		Solution  s = new Solution();
		Iterator it = s.letterCombinations("234").iterator();
		while(it.hasNext())
			System.out.println(it.next());
	}
}

class Solution {
    public static final String[] word = {" ", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    public List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<String>();		//���ڴ洢���
        if (digits.isEmpty()){			//���������ַ���Ϊ��ֱ�ӷ���
            return list;
        }
        String str = "";
        dfs(digits, 0, list, str);                        
        return list;
    }
    //������ȱ���
    public void dfs(String digits, int l, List<String> list, String str){
        if (l == digits.length()){		//�ݹ���ֹ����:Ϊ�ַ�������,�����������
            list.add(str);
            return ;
        }
        String s = word[digits.charAt(l)-'0'];		//��ǰλ����������Ӧ���ַ���
        for(int j=0; j<s.length(); ++j){
            str += s.charAt(j);
            dfs(digits, l+1, list, str);
            str = str.substring(0,str.length()-1);
        }
    }
}
