 #Definition for singly-linked list.
class ListNode:
    def __init__(self,x):
        self.val = x
        self.next = None

class Solution:
    def addTwoNumbers(self, l1: ListNode, l2: ListNode) -> ListNode:
        root = ListNode(0)
        current = root
        carry = 0
        while l1 or l2:
            v1 = v2 = 0
            if l1:
                v1 = l1.val
                l1 = l1.next
            if l2:
                v2 = l2.val
                l2 = l2.next
            val = v1 + v2 + carry
            carry = val // 10
            val = val % 10
            tmp = ListNode(val)
            current.next = tmp
            current = current.next
        if carry:
            tmp = ListNode(carry)
            current.next = tmp
        return root.next
if __name__ == '__main__':
    a = ListNode(2)
    a.next = ListNode(4)
    a.next.next = ListNode(3)

    b = ListNode(5)
    b.next = ListNode(6)
    b.next.next = ListNode(4)

    c = Solution()
    d = c.addTwoNumbers(a, b)
    while d:
        print(d.val)
        d = d.next    
