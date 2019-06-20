class Solution(object):
    def removeDuplicates(self, nums):
        """

        :param nums:
        :return:
        """
        i = 0
        while i < len(nums) - 1:
            if nums[i] == nums[i+1]:
                nums.remove(nums[i])
            else:
                i = i + 1
        return len(nums)

if __name__ == '__main__':
    a = Solution()
    count = a.removeDuplicates([1, 2, 2, 2, 2, 3])
    print(count)
