package com.LeetCode;

import java.util.Scanner;

public class foolishPig {

	public static void main(String[] args) {
		System.out.println("������������");
		Scanner s = new Scanner(System.in);
		int length = s.nextInt();
		System.out.println("������ڵ���ֵ");
		ListNode ln = new ListNode(s.nextInt());		//����ͷ���
		int i = 0;
		ListNode l = ln;
		while(i<length-1) {		//���ڵ���ֵ���δ������
			l.next = new ListNode(s.nextInt());
			l = l.next;
			i++;
		}	
		System.out.println(printNum(removeNthFromEnd(ln, 2)));
	}
	//���ַ�����ʽ��������еĽڵ�ֵ
	public static String printNum(ListNode ln) {
		String str = "";
		str = ln.val+"";
		while(ln.next!=null) {
			str = str+ln.next.val;
			ln = ln.next;
		}
		return str;
	}
	//ɾ������ĵ�����N�����,������N-1���ڵ�ָ��N+1���ڵ�
	public static ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode fast = head;
		while(fast.next!=null&&n>0) {		//�Ƚ���ָ�뻬��N��������
			fast = fast.next;
			n--;
		}
		ListNode slow = head;
		while(fast.next!=null) {		//�ٽ���ָ��Ϳ�ָ��һ�𻬶�������β��
			slow = slow.next;
			fast = fast.next;
		}
		slow.next = slow.next.next;			//��ʱ��ָ���Ӧ�ľ�����Ҫɾ���Ľ��
		return head;
	}
}
//�ڵ���
class ListNode{
	int val;
	ListNode next;
	ListNode(int x){
		val = x;
	}
}
