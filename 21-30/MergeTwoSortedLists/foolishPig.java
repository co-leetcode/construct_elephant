package com.LeetCode;

import java.util.Scanner;

public class foolishPig {

	public static void main(String[] args) {
		ListNode list1 = constractList();		//有序链表1
		ListNode list2 = constractList();		//有序链表2
		ListNode list3 = mergeTwoLists(list1,list2);
		while(list3.next!=null) {
			System.out.println(list3.val);
			list3 = list3.next;
		}
	}
	//创建及初始化有序链表
	public static ListNode constractList() {
		System.out.println("请输入链表长度");
		Scanner s = new Scanner(System.in);
		int length = s.nextInt();
		int i = 0;
		System.out.println("请输入有序节点数值");
		ListNode list = new ListNode(s.nextInt());
		ListNode ln = list;
		while(i<length-1) {
			ln = new ListNode(s.nextInt());
			ln = ln.next;
			i++;
		}
		return list;
	}
	//合并链表
	public static ListNode mergeTwoLists(ListNode list1,ListNode list2) {
		ListNode list3 = new ListNode(0);
		ListNode l3 = list3;
		while(list1!=null||list2!=null) {			//遍历链表直到都不为空
			if(list1==null) {		//有一链表为空则将另一链表直接接在后面
				l3.next = list2;
				break;
			}
			else if(list2==null) {
				l3.next = list1;
				break;
			}else {		//都不为空则将链表节点较小值接在后面
				if(list1.val<list2.val) {
					l3.next = list1;
					list1 = list1.next;
				}else {
					l3.next = list2;
					list2 = list2.next;
				}
			}					
			l3 = l3.next;		//将新链表延长
		}
		return list3.next;
	}
}
//节点类
class ListNode{
	int val;
	ListNode next;
	ListNode(int x){
		val = x;
	}
}
