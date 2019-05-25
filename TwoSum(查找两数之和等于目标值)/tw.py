def solution(num,target):
    if len(num)<2:
        return
    for i in range(0,len(num)-1):
        for j in range(i+1,len(num)):
            if num[i]+num[j]==target:
                return[i,j]
if __name__=='__main__':
    print(solution([2,7,11,5],9))
