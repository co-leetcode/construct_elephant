class Solution(object):
    def threeSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        if not nums:
            return []
        res = []
        for i in range(len(nums)):
            if i < len(nums):
                j = i + 1
            for j in range(j, len(nums)):
                k = 0 - nums[i] - nums[j]              
                if k in nums:
                    k_index = nums.index(k)
                    if k_index not in (i, j):
                        temp = [nums[i], nums[j], k]
                        temp.sort()
                        if temp not in res:
                            res.append(temp)   
        return res   

if __name__ == "__main__":
    solve = Solution()
    print(solve.threeSum([-1, 0, 1, 2, -1, -4]))