class  Minwiki7456
{
	public static void main(String[] args)
	{
		int[] nums =new int[]{10,12,8,7,9,12,8,10,2,5};
		System.out.println("max="+solution(nums));
	}
	private static int solution(int[] nums)
	{
		int start=0,end=nums.length-1,max=0;
		while(end-start>0)
		{
			if(nums[start]>nums[end])
			{
				max=max>nums[end]*(end-start)?max:nums[end]*(end-start);
				end--;
			}
			else
			{
				max=max>nums[start]*(end-start)?max:nums[start]*(end-start);
				start++;
			}
		}
		return max;
    }
}

