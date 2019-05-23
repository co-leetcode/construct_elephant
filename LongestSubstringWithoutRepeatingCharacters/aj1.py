class Solution:
  def __init__(self):
    self.maxString = []
  def longestSubString(self, inputString):
    if inputString == '':
      return ''
    dic = {}
    dic = dic.fromkeys(inputString, 0)
    self.maxString.append(inputString[0])
    for i in range(len(inputString)):
      for j in range(i, len(inputString)):
        if dic[inputString[j]] != 0:
          dic = dic.fromkeys(inputString, 0)
          break
        else:
          if j - i + 1 > len(self.maxString[0]):
            self.maxString = []
            self.maxString.append(inputString[i:j+1])
          elif j - i + 1 == len(self.maxString[0]):
            self.maxString.append(inputString[i:j+1])
          dic[inputString[j]] += 1
inputString = 'abccaabbcbcb'
sol = Solution()
sol.longestSubString(inputString)
print(sol.maxString)

