class Solution(object):
    def isPalindrome(self, x):
        if x < 0 or (x%10 == 0 and x > 0):
            return False
        rev = 0
        carry = -1
        num = x
        temp = []
        while num is not 0:
            temp.append(num % 10)
            carry += 1
            num = num // 10
        while carry > -1:
            print(temp, carry)
            rev += temp.pop(0) * 10 ** carry
            carry -= 1
        print(rev)
        if x == rev:
            return True
        else:
            return False

if __name__ == "__main__":
    solve = Solution()
    print(solve.isPalindrome(123))
    print(solve.isPalindrome(-121))
    print(solve.isPalindrome(10))