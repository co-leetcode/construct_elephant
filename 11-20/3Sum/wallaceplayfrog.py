class Solution(object):
    def threeSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        nums.sort()
        res = []
        for i in range(len(nums)-2):
            if i > 0 and nums[i] == nums[i-1]:
                continue
            head, tail = i+1, len(nums)-1
            while head < tail:
                temp = nums[i] + nums[head] + nums[tail]
                if temp < 0:
                    head += 1
                elif temp > 0:
                    tail -= 1
                else:
                    res.append([nums[i], nums[head], nums[tail]])
                    while head < tail and nums[head] == nums[head+1]:
                        head += 1
                    while head < tail and nums[tail] == nums[tail-1]:
                        tail -= 1
                    head += 1
                    tail -= 1
        return res

if __name__ == "__main__":
    solve = Solution()
    print(solve.threeSum([-1, 0, 1, 2, -1, -4]))