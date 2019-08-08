# Definition for singly-linked list.
class ListNode(object):
     def __init__(self, x):
         self.val = x
         self.next = None

class Solution(object):
    def rotateRight(self, head, k):
        """
        :type head: ListNode
        :type k: int
        :rtype: ListNode
        """
        if head is None:
            return None
        p = head
        stack = []
        count = 0
        while p:
            count += 1
            stack.append(p.val)
            p = p.next
        k = k % count
        while k:
            stack.insert(0, stack.pop())
            k -= 1
        p = q = ListNode(0)
        while stack:
            q.next = ListNode(stack.pop(0))
            q = q.next
        return p.next

    def _rotateRight(self, head, k):
        """
        :type head: ListNode
        :type k: int
        :rtype: ListNode
        """
        if head is None or head.next is None:
            return head
        p = q = head
        count = 1
        while q.next:
            count += 1
            q = q.next
        k = count - (k % count)
        q.next = p
        while k:
            p = p.next
            q = q.next
            k -= 1
        q.next = None
        return p