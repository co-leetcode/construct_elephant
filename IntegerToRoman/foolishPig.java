package LeetCode;

import java.util.Scanner;

public class foolishPig {

	public static void main(String[] args) {
		System.out.println("��������Ҫת��������!");
		Scanner s = new Scanner(System.in);
		System.out.println(change(s.nextInt()));
	}

	public static String change(int x) {
		char[] ch = {'I','V','X','L','C','D','M'};
		StringBuffer s = new StringBuffer();
		int value = 0,index = 0;		//valueΪ�����ĸ�λ��,indexΪ���������ַ�������±�
		while(x>0) {		//��֤��������ÿһλ���ֶ�ת������������
			value = x%10;
			while(value>0&&value<4) {
				s.append(ch[index]);
				value--;
			}
			if(value==4) {		//�����������ֵ�ת��������д洢,��Ҫע���ַ���ÿ�������ĩβ,����ҲӦ�ý�ԭ����������������
				s.append(ch[index+1]);
				s.append(ch[index]);
			}
			if(value>4&&value<9) {		//��4-9���������Ҫ���зּ��洢
				while(value>5) {
					s.append(ch[index]);
					value--;
				}
				s.append(ch[index+1]);
			}
			if(value==9) {		//ͬ��,Ҫ��������洢
				s.append(ch[index+2]);
				s.append(ch[index]);
			}
			x = x/10;
			index += 2;
		}
		return s.reverse().toString();
	}
}
