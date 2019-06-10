class  Minwiki7456
{
	public static void main(String[] args)
	{
		int[] l1nums=new int[]{1,3,5,7,9};
		int[] l2nums=new int[]{2,4,5,8,10};
		ListNode l1=new ListNode(1);
		ListNode temp=l1;
		for(int i=1;i<l1nums.length;i++)
		{
			temp.next=new ListNode(l1nums[i]);
			temp=temp.next;
		}
		ListNode l2=new ListNode(2);
		temp=l2;
		for(int i=1;i<l2nums.length;i++)
		{
			temp.next=new ListNode(l2nums[i]);
			temp=temp.next;
		}
		temp= mergeTwoLists(l1,l2);
		for(int i=0;i<l1nums.length+l2nums.length;i++)
		{
			System.out.println(temp.val);
			temp=temp.next;
		}

	}
	private static ListNode mergeTwoLists(ListNode l1, ListNode l2)
	{
		if(l1==null&&l2==null)
		{
			return null;
		}
		else if(l1==null)
		{
			return l2;
		}
		else if(l2==null)
		{
			return l1;
		}
		ListNode temp;
		ListNode head;
		if(l1.val<=l2.val)
		{
			head=l1;
			if(l1.next!=null)
			{
				l1=l1.next;
			}
			else
			{
				head.next=l2;
				return head;
			}
		}
		else
		{
			head=l2;
			if(l2.next!=null)
			{
				l2=l2.next;
			}
			else
			{
				head.next=l1;
				return head;
			}
		}
		temp=head;
		while(true)
		{
			if(l1.val<=l2.val)
			{
				temp.next=l1;
				temp=temp.next;
				if(l1.next!=null)
				{
					l1=l1.next;
				}
				else
				{
					temp.next=l2;
					return head;
				}
			}
			else
			{
				temp.next=l2;
				temp=temp.next;
				if(l2.next!=null)
				{
					l2=l2.next;
				}
				else
				{
					temp.next=l1;
					return head;
				}
			}
		}
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
