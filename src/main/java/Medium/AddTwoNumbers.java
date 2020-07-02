package Medium;

public class AddTwoNumbers {
//    На вход поступает два не пустых списка чисел (не отрицательных, целых),
//    отображающих цифры чисел в обратном порядке
//    502 = 2-> 0-> 5
//    на выходе нужен список с суммой этих чисел.

//    Definition for singly-linked list.

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = l1;

        while (l1 != null) {
            l1.val += l2 != null ? l2.val : 0;

            if (l1.next == null && (l1.val > 9 || (l2 != null && l2.next != null)))
                l1.next = new ListNode();
            else if (l1.next == null)
                break;

            l1.next.val += l1.val / 10;

            l1.val %= 10;

            l1 = l1.next;
            if (l2 != null)
                l2 = l2.next;
        }
        return res;
    }
}

