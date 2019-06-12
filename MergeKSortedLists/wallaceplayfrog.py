# Definition for singly-linked list.
class ListNode(object):
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution(object):
    def mergeKLists(self, lists):
        """
        :type lists: List[ListNode]
        :rtype: ListNode
        """
        if len(lists) < 2:
            return lists.pop() if lists else None
        amount = len(lists) 
        interval = 1 
        while interval < amount: 
            for i in range(0, amount - interval, interval * 2): 
                lists[i] = self.mergeTwoLists(lists[i], lists[i + interval]) 
                interval *= 2 
        return lists[0] if amount > 0 else lists

    def mergeTwoLists(self, l1 , l2):
        res = temp = ListNode(0)
        while l1 or l2:
            if not l1:
                temp.next = l2
                break
            if not l2:
                temp.next = l1
                break
            if l1.val > l2.val:
                temp.next = l2
                temp = temp.next
                l2 = l2.next
            else:
                temp.next = l1
                temp = temp.next
                l1 = l1.next
        return res.next

l1 = ListNode(1)
l1.next = ListNode(2)
l1.next.next = ListNode(4)
l2 = ListNode(1)
l2.next = ListNode(3)
l2.next.next = ListNode(4)
solve = Solution()
a = solve.mergeKLists([l1, l2])
while a:
    print(a.val)      
    a = a.next  