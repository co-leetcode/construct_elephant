import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
class  Minwiki7456
{
	public static void main(String[] args)
	{
		
		int[] nums = new int[]{0,0,0};
		System.out.println("result:"+threeSum(nums));
	}
	private static List<List<Integer>> threeSum(int[] nums)
	{
		Arrays.sort(nums);
		List<List<Integer>> res = new ArrayList<>();
		int sum=0,start=0,end=nums.length-1;
		for(int i=1;i<nums.length-1;i++)
		{
			start=0;
			end=nums.length-1;
			if(i>1&&nums[i]==nums[i-1]&&nums[i]!=nums[i-2])
				start=i-1;
			if(i>1&&nums[i]==nums[i-2])
				continue;
			//System.out.println("nums[i]:"+nums[i]);
			while(start<i&&end>i)
			{
				sum=nums[start]+nums[i]+nums[end];
				//System.out.println("sum:"+sum);
				if(sum>0)
					end--;
				else if(sum<0)
					start++;
				else
				{
					res.add(Arrays.asList(nums[start], nums[i], nums[end]));
					do
					{
						start++;
					}
					while (start<nums.length&&nums[start]==nums[start-1]);
					do
					{
						end--;
					}
					while (end>0&&nums[end]==nums[end+1]);
				}
			}
		}
		return res;
	}
}

