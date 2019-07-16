class Solution(object):
    def nextPermutation(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        i = len(nums) - 2
        while i>= 0 and nums[i+1] <= nums[i]:
            i -= 1
        if i >= 0:
            j = len(nums) - 1
            while(j >= 0 and nums[j] <= nums[i]):
                j -= 1
            nums[i], nums[j] = nums[j], nums[i]
        self.reverse(nums, i + 1)
    
    def reverse(self, nums, start):
        end = len(nums)-1
        while(start < end):
            nums[start], nums[end] = nums[end], nums[start]
            start += 1
            end -= 1

solve = Solution()
nums = [1,2,3]
solve.nextPermutation(nums)
print(nums)