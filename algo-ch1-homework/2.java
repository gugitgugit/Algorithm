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
class Solution {
    public ListNode insertionSortList(ListNode head) { 
        //singly linked list의 head노드를 입력으로 받는 함수

        if(head == null || head.next == null) { //노드가 없거나 한 개일 경우
            return head; //정렬 불필요. head 리턴
        }

        ListNode resultHead = new ListNode(0); //val이 0인 ListNode 하나 생성
        ListNode previous = resultHead; //생성한 노드를 이전 노드로 설정.
        ListNode next;

        while (head != null) { //주어진 list의 끝까지
            next = head.next; //다음 노드를 next에 저장
            if (previous.val >= head.val) { 
                //이전 노드의 value가 삽입해야할 value 보다 같거나 크면
                previous = resultHead; //처음부터 비교
            }
            while (previous.next != null && previous.next.val < head.val) {
                previous = previous.next; //노드가 삽입될 자리로 이동
            }
            head.next = previous.next; //삽입될 자리의 원래 노드의 next전달
            previous.next = head; //원래 노드와 연결
            head = next; //다음 삽입할 노드
        }

        return resultHead.next; //정렬된 리스트의 시작 노드 전달
    }
}