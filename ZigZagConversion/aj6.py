def convert(s, numRows):
    if numRows <= 1:
        return s
    n = len(s)
    convertStr = ""
    maxGap = 2 * (numRows - 1)
    for i in range(numRows):
        index = i
        if i == 0 or i == numRows-1:
            while index < n:
                convertStr += s[index]
                index += maxGap
        else:
            g1 = 2 * (numRows - i - 1)
            g2 = maxGap - g1
            j = 1

            while index < n:
                convertStr = convertStr + s[index]
                if j % 2 != 0:
                    index = index + g1
                else:
                    index = index + g2
                j += 1
    return convertStr


s = 'LEETCODEISHIRING'
print(convert(s, 4))
print('LDREOEIIECIHNTSG')
