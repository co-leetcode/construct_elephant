class  Minwiki7456
{
	public static void main(String[] args)
	{
		ListNode head = new ListNode(0);
		ListNode temp = head;
		for(int i=1;i<10;i++)
		{
			temp.next=new ListNode(i);
			temp=temp.next;
		}
		head=removeNthFromEnd(head,8);
		temp=head;
		for(int i=0;i<9;i++)
		{
			System.out.print(temp.val+" ");
			if(temp.next!=null)
				temp=temp.next;
		}
	}
	private static  ListNode removeNthFromEnd(ListNode head, int n)
	{
		if(head==null)
			return null;
		if(head.next==null)
			return null;
		ListNode temp = head;
		for(int i=0;i<n-1;i++)
		{
			temp=temp.next;
		}
		if(temp.next==null)
			return head.next;
		else
			temp=temp.next;
		ListNode target = head;
		while(temp.next!=null)
		{
			temp=temp.next;
			target=target.next;
		}
		target.next=target.next.next;
		return head;
	}
}
class ListNode
{
	int val;
	ListNode next;
	ListNode(int x)
	{
		val = x;
	}
}