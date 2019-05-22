class ListNode(object):
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution(object):
    def addTwoNumbers(self, l1, l2):
        x1, x2 = 0, 0
        bit = 0
        while l1 and l2:
            x1 += l1.val * 10**bit
            x2 += l2.val * 10**bit
            bit += 1
            l1 = l1.next
            l2 = l2.next
        sum = x1 + x2
        list1 = list0 = ListNode(-1)
        while sum > 0:
            list1.next = ListNode(sum % 10)
            list1 = list1.next
            sum = int(sum / 10)           
        return list0.next

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
