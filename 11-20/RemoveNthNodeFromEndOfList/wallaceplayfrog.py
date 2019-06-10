# Definition for singly-linked list.
class ListNode(object):
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution(object):
    def removeNthFromEnd(self, head, n):
        """
        :type head: ListNode
        :type n: int
        :rtype: ListNode
        """
        hhead = ListNode(0)
        hhead.next, p, q = head, hhead, hhead
        while n + 1:
            p = p.next
            n -= 1
        q = head
        while p.next: #循环结束q.next即为所要删除结点
            q = q.next
            p = p.next
        q.next = q.next.next
        return hhead.next