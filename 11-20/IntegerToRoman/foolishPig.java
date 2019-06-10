package LeetCode;

import java.util.Scanner;

public class foolishPig {

	public static void main(String[] args) {
		System.out.println("请输入所要转换的整数!");
		Scanner s = new Scanner(System.in);
		System.out.println(change(s.nextInt()));
	}

	public static String change(int x) {
		char[] ch = {'I','V','X','L','C','D','M'};
		StringBuffer s = new StringBuffer();
		int value = 0,index = 0;		//value为整数的个位数,index为罗马数字字符数组的下标
		while(x>0) {		//保证将整数的每一位数字都转换成罗马数字
			value = x%10;
			while(value>0&&value<4) {
				s.append(ch[index]);
				value--;
			}
			if(value==4) {		//根据罗马数字的转换规则进行存储,但要注意字符串每次添加在末尾,所以也应该将原本的罗马数字逆序
				s.append(ch[index+1]);
				s.append(ch[index]);
			}
			if(value>4&&value<9) {		//有4-9区间的数就要进行分级存储
				while(value>5) {
					s.append(ch[index]);
					value--;
				}
				s.append(ch[index+1]);
			}
			if(value==9) {		//同理,要进行逆序存储
				s.append(ch[index+2]);
				s.append(ch[index]);
			}
			x = x/10;
			index += 2;
		}
		return s.reverse().toString();
	}
}
