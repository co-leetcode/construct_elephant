package com.LeetCode;

import java.util.Scanner;

public class foolishPig {

	public static void main(String[] args) {
		System.out.println("请输入链表长度");
		Scanner s = new Scanner(System.in);
		int length = s.nextInt();
		System.out.println("请输入节点数值");
		ListNode ln = new ListNode(s.nextInt());		//链表头结点
		int i = 0;
		ListNode l = ln;
		while(i<length-1) {		//将节点数值依次存进链表
			l.next = new ListNode(s.nextInt());
			l = l.next;
			i++;
		}	
		System.out.println(printNum(removeNthFromEnd(ln, 2)));
	}
	//以字符串形式输出链表中的节点值
	public static String printNum(ListNode ln) {
		String str = "";
		str = ln.val+"";
		while(ln.next!=null) {
			str = str+ln.next.val;
			ln = ln.next;
		}
		return str;
	}
	//删除链表的倒数第N个结点,即将第N-1个节点指向N+1个节点
	public static ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode fast = head;
		while(fast.next!=null&&n>0) {		//先将快指针滑动N个结点距离
			fast = fast.next;
			n--;
		}
		ListNode slow = head;
		while(fast.next!=null) {		//再将慢指针和快指针一起滑动到链表尾部
			slow = slow.next;
			fast = fast.next;
		}
		slow.next = slow.next.next;			//此时慢指针对应的就是所要删除的结点
		return head;
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
