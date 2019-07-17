class Solution(object):
    def generateParenthesis(self, n):
        result = []
        self.generateAll("", n, 0, result)
        return result

    def generateAll(self, current, n, pos, result):
        if (n*2 == pos):
            if self.valid(current):
                result.append(current)
        else:
            current_1 = current + '('
            self.generateAll(current_1, n, pos + 1, result)
            current_2 = current + ')'
            self.generateAll(current_2, n, pos + 1, result)

    def valid(self, current):
        balance = 0
        for c in current:
            if (c == '('):
                balance = balance + 1
            else:
                balance = balance - 1
            if (balance < 0):
                return False
        return balance == 0
solve = Solution()
print(solve.generateParenthesis(3))
