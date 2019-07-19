class Solution(object):
    def myPow(self, x, n):
        """
        :type x: float
        :type n: int
        :rtype: float
        """
        res = 1
        X = x
        if x < 0:
            x = 1/x
        while n:
            if n % 2 == 1:
                res = res * X
            X = X * X
            n = n // 2
        return res
    
solve = Solution()
print(solve.myPow(2, 4))