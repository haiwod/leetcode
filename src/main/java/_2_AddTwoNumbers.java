/**
 * 给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。
 * <p>
 * 请你将两个数相加，并以相同形式返回一个表示和的链表。
 * <p>
 * 你可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 *
 * @author : zhangzy
 * @date : 2022/1/19
 */
public class _2_AddTwoNumbers {

    public static void main(String[] args) {
        LinkedNode l1 = LinkedNode.arrayToLinkedNode(new int[]{3, 6, 9, 3});
        LinkedNode l2 = LinkedNode.arrayToLinkedNode(new int[]{1, 6, 3, 8});
        LinkedNode res = addTwoNumbers(l1, l2);
        while (res != null && res.val != null) {
            System.out.print(res.val + "->");
            res = res.next;
        }
    }

    public static LinkedNode addTwoNumbers(LinkedNode l1, LinkedNode l2) {
        LinkedNode n1 = l1;
        LinkedNode n2 = l2;
        LinkedNode res = new LinkedNode(0);
        LinkedNode cur = res;
        int sum = 0;

        while (n1 != null || n2 != null) {
            if (n1 != null) {
                sum += n1.val;
                n1 = n1.next;
            }
            if (n2 != null) {
                sum += n2.val;
                n2 = n2.next;
            }
            cur.next = new LinkedNode(sum % 10);
            sum /= 10;
            cur = cur.next;
        }
        if (sum == 1) {
            cur.next = new LinkedNode(1);
        }
        return res.next;
    }

    private static class LinkedNode {
        Integer val;
        LinkedNode next;

        public LinkedNode(int val) {
            this.val = val;
        }

        public static LinkedNode arrayToLinkedNode(int[] arr) {
            if (arr != null && arr.length != 0) {
                LinkedNode res = new LinkedNode(arr[0]);
                LinkedNode cur = res;
                for (int i = 1; i < arr.length; i++) {
                    LinkedNode temp = new LinkedNode(arr[i]);
                    cur.next = temp;
                    cur = cur.next;
                }
                return res;
            }
            return null;
        }
    }
}
