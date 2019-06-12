package com.LeetCode;

import java.util.Scanner;

public class foolishPig {

	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(5);
		ListNode l2 = new ListNode(1);
		l2.next = new ListNode(3);
		l2.next.next = new ListNode(4);
		ListNode l3 = new ListNode(2);
		l3.next = new ListNode(6);
		ListNode[] lists = {l1,l2,l3};
		ListNode ln = mergeKLists(lists);
		System.out.println(ln.val);
		while(ln.next!=null) {
			System.out.println(ln.next.val);
			ln = ln.next;
		}		
	}
	public static ListNode mergeKLists(ListNode[] lists){
        if(lists.length == 0)		//��������Ϊ���򷵻ؿ�
            return null;
        if(lists.length == 1)		//�������鳤��Ϊ1�򷵻ش�Ψһ����
            return lists[0];
        if(lists.length == 2){		//������Ϊ2��Ϊ�ϲ�������������
           return mergeTwoLists(lists[0],lists[1]);
        }
        //�����ȴ���2֮������η��ϲ�
        int mid = lists.length/2;
        ListNode[] l1 = new ListNode[mid];
        for(int i = 0; i < mid; i++){
            l1[i] = lists[i];
        }

        ListNode[] l2 = new ListNode[lists.length-mid];
        for(int i = mid,j=0; i < lists.length; i++,j++){
            l2[j] = lists[i];
        }

        return mergeTwoLists(mergeKLists(l1),mergeKLists(l2));
    }
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        ListNode head = null;
        if (l1.val <= l2.val){
            head = l1;
            head.next = mergeTwoLists(l1.next, l2);
        } else {
            head = l2;
            head.next = mergeTwoLists(l1, l2.next);
        }
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
