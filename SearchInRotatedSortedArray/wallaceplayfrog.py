class Solution(object):
    def search(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: int
        """ 
        l, r = 0, len(nums)-1
        while l <= r:
            m = int(l + (r - l) / 2)
            print(m)
            if nums[m] == target:
                return m
            if nums[m] < nums[r]:
                if nums[m] < target and target <= nums[r]:
                    l = m + 1
                else:
                    r = m - 1
            else:
                if nums[m] > target and target >= nums[l]:
                    r = m - 1
                else:
                    l = m + 1
        
        return -1
solve = Solution()
print(solve.search([4,5,6,7,0,1,2], 0))
print(solve.search([4,5,6,7,0,1,2], 3))