class Solution(object):
    def divide(self, dividend, divisor):
        """
        :type dividend: int
        :type divisor: int
        :rtype: int
        """
        below = 1
        if dividend < 0 < divisor or divisor < 0 < dividend:
            below = -1

        dividend,  divisor = abs(dividend),  abs(divisor)
        if dividend < divisor:
            return 0
        elif divisor == 1:
            result = dividend * below
            if result >= 2**31-1:
                return 2**31-1
            return result


        result = len(range(divisor, dividend, divisor))
        if (result+1) * divisor == dividend:
            result += 1 
        return result * below
