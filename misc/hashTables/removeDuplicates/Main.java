package misc.hashTables.removeDuplicates;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class Main {

    public static class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    public static void removeDuplicates(Node head) {
        HashSet<Integer> set = new HashSet<>();

        Node current = head;
        Node prev = null;
        while (current != null) {
            int currentVal = current.val;

            if (set.contains(currentVal)) {
                prev.next = current.next;
            }
            else {
                set.add(currentVal);
                prev = current;
            }
            current = current.next;
        }
    }

    static void printList(Node head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        Node start = new Node(10);
        start.next = new Node(12);
        start.next.next = new Node(11);
        start.next.next.next = new Node(11);
        start.next.next.next.next = new Node(12);
        start.next.next.next.next.next = new Node(11);
        start.next.next.next.next.next.next = new Node(10);

        System.out.println("Initial linked list: ");
        printList(start);

        removeDuplicates(start);
        System.out.println("\nLinked list with no duplicates: ");
        printList(start);
    }
}
