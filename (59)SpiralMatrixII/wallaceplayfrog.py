class Solution(object):
    def generateMatrix(self, n):
        """
        :type n: int
        :rtype: List[List[int]]
        """
        dr = [0, 1, 0, -1]
        dc = [1, 0, -1, 0]
        r = c = di = 0
        res = [[False]*n for _ in range(n)]
        for i in range(1, n * n + 1):
            #print(r, c, i)
            res[r][c] = i
            cr, cc = r + dr[di], c + dc[di]
            if 0 <= cr < n and 0 <= cc < n and not res[cr][cc]:
                r, c = cr, cc
            else:
                di = (di + 1) % 4
                r, c = r + dr[di], c + dc[di]
        return res

solve = Solution()
for i in range(5):
    for j in solve.generateMatrix(i):
        print(j)