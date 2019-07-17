class Solution(object):
    def isValidSudoku(self, board):
        """
        :type board: List[List[str]]
        :rtype: bool
        """
        '''
        dict.get(key, default=None) Python 字典(Dictionary) get() 函数返回指定键的值，如果值不在字典中返回默认值。
        '''
        #init data 
        rows = [{} for i in range(9)] 
        #print(rows)
        columns = [{} for i in range(9)] 
        boxes = [{} for i in range(9)] 
        # validate a board 
        for i in range(9): 
            for j in range(9): 
                num = board[i][j] 
                if num != '.': 
                    num = int(num) 
                    box_index = (i // 3 ) * 3 + j // 3 
                    
                    # keep the current cell value 
                    rows[i][num] = rows[i].get(num, 0) + 1 
                    columns[j][num] = columns[j].get(num, 0) + 1 
                    boxes[box_index][num] = boxes[box_index].get(num, 0) + 1 
                    # check if this value has been already seen before 
                    if rows[i][num] > 1 or columns[j][num] > 1 or boxes[box_index][num] > 1: 
                        return False 
        return True

solve = Solution()
print(solve.isValidSudoku([ ["5","3",".",".","7",".",".",".","."], ["6",".",".","1","9","5",".",".","."], [".","9","8",".",".",".",".","6","."], ["8",".",".",".","6",".",".",".","3"], ["4",".",".","8",".","3",".",".","1"], ["7",".",".",".","2",".",".",".","6"], [".","6",".",".",".",".","2","8","."], [".",".",".","4","1","9",".",".","5"], [".",".",".",".","8",".",".","7","9"] ]))