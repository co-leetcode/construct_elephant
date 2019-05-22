package com.LeetCode;
/**
 * 使用链表逆序存储两个不同的数字,一个节点只能存储一个数字,并求和存储
 * @author Zhi
 */
import java.util.Scanner;

public class AddTwoNumbers {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("请输入数字1:");
		int x = s.nextInt();
		System.out.println("请输入数字2");
		int y = s.nextInt();
		ListNode l1 = new ListNode(x%10);		//逆序存储第一个节点为个位数
		l1.next=new ListNode(x%100/10);		//第二个节点十位数
		l1.next.next=new ListNode(x/100);		//第三个节点百位数
		ListNode l2 = new ListNode(y%10);
		l2.next=new ListNode(y%100/10);
		l2.next.next=new ListNode(y/100);
		int a=0,b=0,c=0;		//a为两数个位相加之和,b为十位,c为百位
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
		ListNode l3 = new ListNode(a);		//将所加结果存储在新链表中
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
