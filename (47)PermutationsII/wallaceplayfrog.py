class Solution(object):
    def permuteUnique(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        nums.sort()
        res = []
        used = [False] * len(nums)
        def backtrack(index, pre):
            if index == len(nums):
                res.append(pre.copy())
                return
            for i in range(len(nums)):
                if not used[i]:
                    # 如果当前值和之前的值相等并且还没有使用过，跳过
                    if i > 0 and nums[i] == nums[i - 1] and not used[i - 1]:
                        #print('跳过')
                        continue
                    used[i] = True
                    pre.append(nums[i])
                    #print(index)
                    #print(used)
                    #print(pre, '\n')
                    backtrack(index + 1, pre)
                    used[i] = False
                    pre.pop()
        backtrack(0, [])
        return res

solve = Solution()
print(solve.permuteUnique([1,1,2]))