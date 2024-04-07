// 22011475 구준혁

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }==
 * }
 */
class Solution {
    ListNode findMiddle(ListNode head) {  // 가운데를 찾는 함수.
        ListNode slow = head;  // 한번에 한칸씩 리스트를 순회.
        ListNode fast = head;  // 한번에 두칸씩 리스트를 순회.
        ListNode previous = null;  // 이전 노드를 저장.

        while(fast != null && fast.next != null) {
            previous = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        previous.next = null;  //middle 왼쪽과 오른쪽 분리

        return slow;
    }

    public TreeNode sortedListToBST(ListNode head) {
        if(head == null)  // 노드가 한개도 없으면 null 리턴.
            return null;
        if(head.next == null)  // 노드가 하나 있으면 root 노드만 리턴.
            return new TreeNode(head.val);

        ListNode middle = findMiddle(head);
        TreeNode root = new TreeNode(middle.val);  // middle.val을 root 노드로 설정.
        root.left = sortedListToBST(head);  // middle 왼쪽의 리스트들을 root노드의 왼쪽 트리.
        root.right = sortedListToBST(middle.next);  // middle 오른쪽의 리스트들을 root노드의 오른쪽 트리.

        return root;
    }
}