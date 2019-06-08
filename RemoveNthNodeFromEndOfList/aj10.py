class Solution:
    def removeNthFromEnd(self, head, n):
        tem = head
        num_tem = n
        if not head:
            return None
        while tem and num_tem > 1:
            tem = tem.next
            num_tem -= 1
        tem_n = tem
        head_n = head
        pre = head
        while tem_n.next:
            tem_n = tem_n.next
            pre = head_n
            head_n = head_n.next
        if head_n==head:
            return head.next
        else:
            pre.next = head_n.next
            return head
