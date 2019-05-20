package test0519;

public class Test01 {

    public static void main(String[] args) {
        ListNode listNode01 = new ListNode(2);
        listNode01.next = new ListNode(4);


    }



    public static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
      }
    }




}
