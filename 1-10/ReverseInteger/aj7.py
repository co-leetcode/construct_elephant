class SolutionReverse(object):
    def reverse(self,x):
        if x in range(-2**31,0):
            x=-int(str(x)[1:][::-1])
        elif x in range(0,2**31):
            x=int(str(x)[::-1])
        else:
            x=0
        return x
if __name__=='__main__':
    num = -123
    s=SolutionReverse()
    print(s.reverse(num))
