class Solution(object):
    def multiply(self, num1, num2):
        """
        :type num1: str
        :type num2: str
        :rtype: str
        """
        if num1 == '0' or num2 == '0':
            return '0'
        n = num1[::-1]
        j = 0
        tmp = 0
        for i in n:
            tmp += self.strmultnum(num2, self.strtoint(i))*10**j
            j += 1
        return tmp
    
    def strtoint(self, string):
        return ord(string)-ord('0')
    
    def strmultnum(self, string, n):
        res = []
        s = string[::-1]
        for i in s:
            res.append(self.strtoint(i)*n)
        res = self.carry(res)
        return res
    
    def carry(self, res):
        i = 0
        tmp = 0
        while res:
            a = res.pop(0)
            c = a//10
            a = a%10
            tmp += a*10**i + c*10**(i+1)
            i += 1
        return tmp

solve = Solution()
print(solve.multiply('123', '3'))
        