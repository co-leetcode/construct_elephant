package com.LeetCode;

import java.util.Scanner;

public class foolishPig {

	public static void main(String[] args) {
		ListNode list1 = constractList();		//��������1
		ListNode list2 = constractList();		//��������2
		ListNode list3 = mergeTwoLists(list1,list2);
		while(list3.next!=null) {
			System.out.println(list3.val);
			list3 = list3.next;
		}
	}
	//��������ʼ����������
	public static ListNode constractList() {
		System.out.println("������������");
		Scanner s = new Scanner(System.in);
		int length = s.nextInt();
		int i = 0;
		System.out.println("����������ڵ���ֵ");
		ListNode list = new ListNode(s.nextInt());
		ListNode ln = list;
		while(i<length-1) {
			ln = new ListNode(s.nextInt());
			ln = ln.next;
			i++;
		}
		return list;
	}
	//�ϲ�����
	public static ListNode mergeTwoLists(ListNode list1,ListNode list2) {
		ListNode list3 = new ListNode(0);
		ListNode l3 = list3;
		while(list1!=null||list2!=null) {			//��������ֱ������Ϊ��
			if(list1==null) {		//��һ����Ϊ������һ����ֱ�ӽ��ں���
				l3.next = list2;
				break;
			}
			else if(list2==null) {
				l3.next = list1;
				break;
			}else {		//����Ϊ��������ڵ��Сֵ���ں���
				if(list1.val<list2.val) {
					l3.next = list1;
					list1 = list1.next;
				}else {
					l3.next = list2;
					list2 = list2.next;
				}
			}					
			l3 = l3.next;		//���������ӳ�
		}
		return list3.next;
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
