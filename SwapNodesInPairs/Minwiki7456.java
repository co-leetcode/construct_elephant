class  Minwiki7456
{
	public static void main(String[] args)
	{
		int[] l1nums=new int[]{1,3,5,7,9};
		ListNode l1=new ListNode(1);
		ListNode temp=l1;
		for(int i=1;i<l1nums.length;i++)
		{
			temp.next=new ListNode(l1nums[i]);
			temp=temp.next;
		}
		l1=swapPairs(l1);
		for(int i=0;i<l1nums.length;i++)
		{
			System.out.println(l1.val);
			l1=l1.next;
		}

	}
	private static ListNode swapPairs(ListNode head)
	{
		ListNode pre =new ListNode(0);
		ListNode left;
		ListNode right;
		ListNode temp;
		pre.next=head;
		temp=pre;
		while(temp.next!=null&&temp.next.next!=null)
		{
			left=temp.next;
			right=left.next;
			temp.next=right;
			temp=left;
			left.next=right.next;;
			right.next=left;
		}
		return pre.next;
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





