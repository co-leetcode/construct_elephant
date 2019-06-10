class Solution:
    def longestCommonPrefix(self, strs):
        if not strs:
            return ""
        else:
            minSubStr = strs[0]
            for subStr in strs:
                if len(subStr) < len(minSubStr):
                    minSubStr = subStr
            for subStr in strs:
                if subStr == minSubStr:
                    continue
                for i in range(len(minSubStr)):
                    if subStr[i] == minSubStr[i]:
                        i = i + 1
                    elif i == 0:
                        return 0
                    else:
                        minSubStr = minSubStr[:i]
                        break
            return minSubStr
if __name__ == "__main__":
    solve = Solution()
    print(solve.longestCommonPrefix('flower''flow'))

