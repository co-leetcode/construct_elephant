class Solution(object):
    def fourSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[List[int]]
        """
        nums.sort()
        res = []
        for i in range(len(nums)-2):
            if i > 0 and nums[i] == nums[i-1]:
                continue
            for j in range(i+1, len(nums)-2):
                if j > 0 and nums[j] == nums[i-1]:
                    continue
                head, tail = j+1, len(nums)-1
                while head < tail:
                    temp = nums[i] + nums[j] + nums[head] + nums[tail]
                    if temp < target:
                        head += 1
                    elif temp > target:
                        tail -= 1
                    else:
                        res.append([nums[i], nums[j], nums[head], nums[tail]])
                        while head < tail and nums[head] == nums[head+1]:
                            head += 1
                        while head < tail and nums[tail] == nums[tail-1]:
                            tail -= 1
                        head += 1
                        tail -= 1
        return res

if __name__ == "__main__":
    solve=Solution()
    print(solve.fourSum([1, 0, -1, 0, -2, 2], 0))  