class Solution(object):
    def maxSubArray(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        res = nums[0]
        sum = 0
        for i in nums:
            if sum > 0:
                sum += i
            else:
                sum = i
            res = max(res, sum)
        return res
    
    def maxSubArray2(self, nums):
        res = len(nums) and max(nums)
        temp = 0
        for i in nums:
            print(i, temp+i)
            temp = max(i, temp + i)
            print(res, temp)
            res = max(res, temp)
        return res

solve = Solution()
print(solve.maxSubArray([-2,1,-3,4,-1,2,1,-5,4]))
print(solve.maxSubArray2([-2,1,-3,4,-1,2,1,-5,4]))