package com.LeetCode;
/**
 * ʹ����������洢������ͬ������,һ���ڵ�ֻ�ܴ洢һ������,����ʹ洢
 * @author Zhi
 */
import java.util.Scanner;

public class AddTwoNumbers {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("����������1:");
		int x = s.nextInt();
		System.out.println("����������2");
		int y = s.nextInt();
		ListNode l1 = new ListNode(x%10);		//����洢��һ���ڵ�Ϊ��λ��
		l1.next=new ListNode(x%100/10);		//�ڶ����ڵ�ʮλ��
		l1.next.next=new ListNode(x/100);		//�������ڵ��λ��
		ListNode l2 = new ListNode(y%10);
		l2.next=new ListNode(y%100/10);
		l2.next.next=new ListNode(y/100);
		int a=0,b=0,c=0;		//aΪ������λ���֮��,bΪʮλ,cΪ��λ
		a = l1.val+l2.val;
		b = l1.next.val+l2.next.val;
		c = l1.next.next.val+l2.next.next.val;
		if(a>9) {
			a = a-10;
			b = b+1;
		}
		if(b>9) {
			b = b-10;
			c = c+1;
		}
		ListNode l3 = new ListNode(a);		//�����ӽ���洢����������
		l3.next = new ListNode(b);
		l3.next.next = new ListNode(c);
		System.out.println(l3.val+"->"+l3.next.val+"->"+l3.next.next.val);
	}
}

class ListNode{
	int val;
	ListNode next;
	ListNode(int x){
		val = x;
	}
}
