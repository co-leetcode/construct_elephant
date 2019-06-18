class Solution(object):
    def divide(self, dividend, divisor):
        """
        :type dividend: int
        :type divisor: int
        :rtype: int
        """
        res = 0 
        sign = 1 if dividend ^ divisor >= 0 else -1 
        #print(sign) 
        dividend = abs(dividend) 
        divisor = abs(divisor) 
        while dividend >= divisor: 
            tmp, i = divisor, 1 
            #print(dividend, divisor)
            while dividend >= tmp: 
                #print(dividend, tmp)
                dividend -= tmp 
                res += i 
                i <<= 1 
                tmp <<= 1 
        res = res * sign 
        return min(max(-2**31, res), 2**31-1)

solve = Solution()
print(solve.divide(15,3))