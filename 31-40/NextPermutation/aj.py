def nextPermutation(self, s, words):
        l=[]
        if(words==[]):return []
        n=len(words[0])
        q={}
        for i in words:
            if i in q:q[i]+=1
            else:q[i]=1
        for t in range(n):
            d={}
            a=t 
            b=t 
            while a+len(words)*n<=len(s): 
                word=s[b:b+n] 
                b=b+n 
                if(word not in words): 
                a=b 
                d.clear() 
            else: 
                if word in d:d[word]+=1 
                else:d[word]=1 
                while d[word]>q[word]: 
                    d[s[a:a+n]]-=1 
                    a=a+n 
                if b-a==len(words)*n:l.append(a) 
        return l
