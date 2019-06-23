class Solution(object):
    def searchRange(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        res = []
        lo = hi = -1
        flag = True
        for i in range(len(nums)):
            if nums[i] == target:
                if flag == True:
                    lo = hi = i
                    flag = False
                else:
                    hi = i
        res.append(lo)
        res.append(hi)
        return res

solve = Solution()
print(solve.searchRange([5,7,7,8,8,10], 8))