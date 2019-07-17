class Solution(object):
    def searchInsert(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: int
        """
        left, right = 0, len(nums) - 1
        if nums[left] == target:
            return left
        if nums[right] == target:
            return right
        mid = int((right + left) / 2)
        while left <= right:
            #print(left, mid, right)
            if nums[mid] == target:
                return mid
            if nums[mid] > target:
                right = mid - 1
                mid = int((right + left) / 2)
            else:
                left = mid + 1
                mid = int((right + left) / 2)
        return left
                

solve = Solution()
print(solve.searchInsert([1,3,5,6,7,8,9,11], 2))