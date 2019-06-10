import java.util.Arrays;
class  Minwiki7456
{
	public static void main(String[] args)
	{
		
		int[] nums = new int[]{1,2,-1,-8,-1,-4,-2,-3,2,4};
		int target=15;
		System.out.println("result:"+threeSumClosest(nums,target));
	}
	private static int threeSumClosest(int[] nums,int target)
	{
		Arrays.sort(nums);
		int res=nums[0]+nums[1]+nums[2],start=0,end=0,sum=0;
		for(int i=0;i<nums.length-2;i++)
		{
			start=i+1;
			end=nums.length-1;
			do
			{
				sum=nums[i]+nums[start]+nums[end];
				if(sum==target)
					return sum;
				else if(sum>target)
				{
					res=Math.abs(sum-target)>Math.abs(res-target)?res:sum;
					end--;
				}
				else
				{
					res=Math.abs(sum-target)>Math.abs(res-target)?res:sum;
					start++;
				}
			}
			while (end!=start);
		}
		return res;		
	}
}

