class Solution(object):
    def getPermutation(self, n, k):
        """
        :type n: int
        :type k: int
        :rtype: str
        """
        nin = ''
        for i in range(n):
            nin += str(i + 1)
        res = []
        def dfs(res, nin, tmp):
            if not nin: res.append(tmp)
            if len(res) == k:
                return
            for i in range(len(nin)):
                tmp += nin[i]
                dfs(res, nin[:i] + nin[i+1:], tmp)
                tmp = tmp[:-1]
        
        dfs(res, nin, '')
        print(res)
        return str(sorted(res)[k - 1])

solve = Solution()
print(solve.getPermutation(3, 5))   