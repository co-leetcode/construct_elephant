# Definition for singly-linked list.
class ListNode(object):
     def __init__(self, x):
         self.val = x
         self.next = None

class Solution(object):
    def swapPairs(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        if head is None or head.next is None:
            return head
        
        p=head.next
        pre=None
        
        while head:
            
            a=head
            b=a.next
            if b:
                head=b.next 
                
                if pre:
                    pre.next=b
                    b.next=a
                else:
                    b.next=a
                a.next=None 
                pre=a
            else:
                head=b
                if pre:
                    pre.next=a
        return p
