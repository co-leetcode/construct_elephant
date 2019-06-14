# Definition for singly-linked list.
class ListNode(object):
     def __init__(self, x):
         self.val = x
         self.next = None

class Solution(object):
    def reverseKGroup(self, head, k):
        """
        :type head: ListNode
        :type k: int
        :rtype: ListNode
        """
        h1=head
        p=None
        cnt=0
        while head and cnt<k:
            if cnt==k-1:
                p=head
            head=head.next
            cnt+=1
        if p:
            p.next=None
            t1,tail=self.rev(h1)
            t2=self.reverseKGroup(head,k)
            tail.next=t2
        
        else:
            t1=h1
        return t1
        
    def rev(self, head):
        '''
        链表的反转
        '''
        l1=None
        tail=l2=head
        
        while l2:
            t=l2 
            l2=l2.next 
            t.next=l1 
            l1=t 
        return l1,tail
