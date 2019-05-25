import java.util.Scanner;
class  Minwiki7456
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter two integers:");
		//num1,num2�洢����ķǸ�����
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		//��num1�洢��list1Ϊ�׵�������
		ListNode list1=new ListNode(num1%10);
		ListNode tempList=list1;
		num1/=10;
		while(num1!=0)
		{
			tempList.next=new ListNode(num1%10);
			tempList=tempList.next;
			num1/=10;
		}
		//��num2�洢��list2Ϊ�׵�������
		ListNode list2=new ListNode(num2%10);
		tempList=list2;
		num2/=10;
		while(num2!=0)
		{
			tempList.next=new ListNode(num2%10);
			tempList=tempList.next;
			num2/=10;
		}
		//list1��list2��ӵõ�list3
		ListNode list3=addTwoNum(list1,list2);
		//������
		System.out.print("Result:"+listToString(list1)+"+"+listToString(list2)+"="+listToString(list3));
	}
	//���洢�Ǹ�����������ת�����ַ���
	public static String listToString(ListNode list)
	{
		String str=new String("");;
		while(list.next!=null)
		{
			str=list.val+str;
			list=list.next;
		}
		str=list.val+str;
		return str;
	}
	//�������
	public static ListNode addTwoNum(ListNode list1,ListNode list2)
	{
		//�Ƚ���������ÿ���ڵ���ӣ��ϳ�����ĳ������ֽ���������ֱ�Ӹ�ֵ���õ��������list3
		ListNode list3=new ListNode(list1.val+list2.val);
		ListNode tempList=list3;
		while(list1.next!=null||list2.next!=null)
		{
			if(list1.next!=null)
			{
				if(list2.next!=null)
				{
					tempList.next=new ListNode(list1.next.val+list2.next.val);
					tempList=tempList.next;
					list1=list1.next;
					list2=list2.next;
				}
				else
				{
					tempList.next=new ListNode(list1.next.val);
					tempList=tempList.next;
					list1=list1.next;
				}
			}
			else
			{
				if(list2.next!=null)
				{
					tempList.next=new ListNode(list2.next.val);
					tempList=tempList.next;
					list2=list2.next;
				}
			}
		}
		//��list3��ÿ���ڵ���н�λ��飬��Ҫ��λ�Ľ��н�λ
		tempList=list3;
		while(tempList.next!=null)
		{
			if(tempList.val>9)
			{
				tempList.val-=10;
				tempList.next.val++;
			}
			tempList=tempList.next;
		}
		if(tempList.val>9)
		{
			tempList.next=new ListNode(1);
		}
		return list3;
	}
}
//�ڵ���
class ListNode
{
	int val;
    ListNode next;
    ListNode(int x) 
	{
		val = x; 
	}
}