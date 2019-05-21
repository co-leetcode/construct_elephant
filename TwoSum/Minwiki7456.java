import java.util.Scanner;
public class Minwiki7456
{
	public static void main(String[] args)
	{
		int[] mylist=new int[10];
		int target=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter 10 integers:");
		for(int i=0;i<10;i++)
		{
			mylist[i]=scan.nextInt();
		}
		System.out.println("Please enter a target value:");
		target=scan.nextInt();
		for(int i=0;i<9;i++)
		{
			for(int j=i+1;j<10;j++)
			{
				if((mylist[i]+mylist[j])==target)
				{
					System.out.println("["+i+","+j+"]");
				}
			}
		}
	}
}