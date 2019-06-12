
class ListNode:
    def __init__(self, x):
         self.val = x
         self.next = None
class Solution:
    def mergeKLists(self, lists):
        """
        :type lists: List[ListNode]
        :rtype: ListNode
        """
        res = []
        for i in lists:
            while i :
                res.append(i.val)
                i  = i.next
                if res == []:
                    return []
                res.sort()
                l =  ListNode(0)
                first = l
                while res:
                    l.next = ListNode(res.pop(0))
                    l = l.next
                return first.next
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
