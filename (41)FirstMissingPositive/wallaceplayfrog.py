class Solution(object):
    def firstMissingPositive(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        length = len(nums)
        if length == 0:
            return 1
        
        for i in range(length):
            while nums[i] > 0 and nums[i] <= length:
                if nums[nums[i] - 1] == nums[i]:
                    break
                self.swap(i, nums[i] - 1, nums)

        for i in range(length):
            if nums[i] != i + 1:
                return i + 1
        return length

    def swap(self, m, n, nums):
        if nums[m] == nums[n]:
            return
        nums[m], nums[n] = nums[n], nums[m] 

solve = Solution()
print(solve.firstMissingPositive([7, 8, 9, 11, 12]))
print(solve.firstMissingPositive([3, 4, -1, -1]))