import java.util.ArrayList;

class Main {

    public static void main(String[] args) {

        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);
        ListNode node7 = new ListNode(7);
        ListNode node8 = new ListNode(7);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = node8;

        methodToPrint(removeElements(node1));

    }

    public static ListNode removeElements(ListNode head) {

        ArrayList<Integer> array = new ArrayList<Integer>();
        ArrayList<Integer> array2 = new ArrayList<Integer>();

        array = methodToArrayList(head);
        array2 = delete(array);
        head = buildNewListNode(array2);

        return head;
    }


    public static ArrayList methodToArrayList(ListNode head) {
        ListNode current = head;
        ArrayList newArray = new ArrayList();
        newArray.add(current.val);
        while (current != null && current.next != null) {
            current = current.next;
            newArray.add(current.val);

        }
        return newArray;
    }


    public static ArrayList delete(ArrayList listNew) {
        for (int i = 0; i < listNew.size() - 1; i++) {
            if (listNew.get(i) == listNew.get(i + 1)) {
                listNew.remove(i);
            }
        }
        return listNew;
    }

    public static ListNode buildNewListNode(ArrayList<Integer> listOfIntegers) {

        if (listOfIntegers.isEmpty())
            return null;

        ListNode head = new ListNode(listOfIntegers.get(0));
        ListNode current = head;
        for (int i = 1; i < listOfIntegers.size(); i++) {
            current.next = new ListNode(listOfIntegers.get(i));
            current = current.next;
        }
        return head;
    }


    public static void methodToPrint(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.println(current.val + " ");
            current = current.next;
        }
    }

    public static class ListNode {
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
}


