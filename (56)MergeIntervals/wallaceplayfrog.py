class Solution(object):
    def merge(self, intervals):
        """
        :type intervals: List[List[int]]
        :rtype: List[List[int]]
        """
        start, end = 0, -1
        intervals.sort(key = lambda x:x[start])
        res = []
        for interval in intervals:
            if res == [] or interval[start] > res[-1][end]:
                res.append(interval)
            elif interval[end] > res[-1][end]:
                res[-1][end] = interval[end]
        
        return res

solve = Solution()
print(solve.merge([[1,3],[2,6],[8,10],[15,18]]))