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
        a = ListNode(0)
        p = a
        while True:
            count = k  #记数
            stack = [] #栈的空间大小与K有关
            temp = head
            while count and temp:
                stack.append(temp)
                temp = temp.next
                count -= 1
            if count:
                p.next = head
                break
            while stack:
                p.next = stack.pop()
                p = p.next
            p.next = temp
            head = temp
        
        return a.next
