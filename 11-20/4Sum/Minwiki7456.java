import java.util.LinkedList;
import java.util.List;
import java.util.Arrays;
class  Minwiki7456
{
	public static void main(String[] args)
	{
		int[] nums = new int[]{3,6,2,4,-5,-2,2,-1,0,0,-4,2,1,1};
		System.out.println("result:"+fourSum(nums,8));
	}
	private static List<List<Integer>> fourSum(int[] nums, int target)
	{
		/*
		i,j为固定的两个数，lift和right为双指针。
		*/
		Arrays.sort(nums);
		List<List<Integer>> res = new LinkedList<>();
        int n = nums.length;
		for (int i = 0; i < n - 3; i++)
		{
            if (i > 0 && nums[i] == nums[i - 1])
				continue;
            if (nums[i] + nums[i + 1] + nums[i + 2] + nums[i + 3] > target)
				break;
            if (nums[i] + nums[n - 1] + nums[n - 2] + nums[n - 3] < target)
				continue;
            for (int j = i + 1; j < n - 2; j++)
			{
                if (j - i > 1 && nums[j] == nums[j - 1])
					continue;
                if (nums[i] + nums[j] + nums[j + 1] + nums[j + 2] > target)
					break;
                if (nums[i] + nums[j] + nums[n - 1] + nums[n - 2] < target)
					continue;
                int left = j + 1;
                int right = n - 1;
                while (left < right)
				{
                    int tmp = nums[i] + nums[j] + nums[left] + nums[right];
                    if (tmp == target)
					{
                        List<Integer> tmpList = new LinkedList<>(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        res.add(tmpList);
                        while (left < right && nums[left] == nums[left + 1])
							left += 1;
                        while (left < right && nums[right] == nums[right - 1])
							right -= 1;
                        left += 1;
                        right -= 1;
                    }else if(tmp > target)
						right -= 1;
                    else
						left += 1;
                }
            }
        }
        return res; 
	}
}
