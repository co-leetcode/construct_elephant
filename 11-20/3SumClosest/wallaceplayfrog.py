class Solution(object):
    def threeSumClosest(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: int
        """
        nums.sort() 
        #print(nums) 
        n = len(nums) 
        res = float("inf") 
        for i in range(n): 
            if i > 0 and nums[i] == nums[i-1]: 
                continue 
            left = i + 1 
            right = n - 1 
            while left < right : 
                #print(left,right) 
                cur = nums[i] + nums[left] + nums[right] 
                if cur == target:return target 
                if abs(res-target) > abs(cur-target): 
                    res = cur 
                if cur > target: 
                    right -= 1 
                elif cur < target: 
                    left += 1 
        return res

if __name__ == "__main__":
    solve = Solution()
    print(solve.threeSumClosest([-1, 2, 1, -4],1))