class Solution(object):
    def uniquePaths(self, m, n):
        """
        :type m: int
        :type n: int
        :rtype: int
        """
        res = []
        row = [0] * (m - 1)
        col = [1] * (n - 1)
        mertix = row + col
        used = [False] * len(mertix)
        def backtrack(index, pre):
            if index == len(mertix):
                res.append(pre.copy())
                return
            for i in range(len(mertix)):
                if not used[i]:
                    # 如果当前值和之前的值相等并且还没有使用过，跳过
                    if i > 0 and mertix[i] == mertix[i - 1] and not used[i - 1]:
                        #print('跳过')
                        continue
                    used[i] = True
                    pre.append(mertix[i])
                    #print(index)
                    #print(used)
                    #print(pre, '\n')
                    backtrack(index + 1, pre)
                    used[i] = False
                    pre.pop()
        backtrack(0, [])
        return len(res)
solve = Solution()
print(solve.uniquePaths(3, 2))
print(solve.uniquePaths(7, 3))