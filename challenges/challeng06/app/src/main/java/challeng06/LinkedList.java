
package challeng06;

import org.w3c.dom.Node;



public class LinkedList {

    Node head;

    public void insert(int value)  {
        Node newInsertNode = new Node(value);
        if (head != null) {
            newInsertNode.next = head;
        }
        head = newInsertNode;
    }

    public boolean includes(int value){
        Node current = head;
        while (current != null) {
            if (value == current.value)return true;
            current = current.next;
        }
        return false;
    }

    public String toString(){
        String result = "";
        Node current = head;
        while (current != null) {
            result = result + "{ "+ current.value + " } -> ";
            if (current.next == null) {
                result = result + "NULL";
                return result;
            }
            current = current.next;
        }
        return result;
    }

    public void append(int value)  {
        Node newInsertNode = new Node(value);
        if (head == null) {
            head = newInsertNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newInsertNode;
        }
    }

    public void insertBefore(int value, int newValue) {
        Node newInsertNode = new Node(newValue);
        if (head == null) {
            head = newInsertNode;
        } else if (head.value == value) {
            insert(newValue);
        } else {
            Node current = head;
            while (current.next != null) {
                if (current.next.value == value) {
                    newInsertNode.next = current.next;
                    current.next = newInsertNode;
                    break;
                }
                current = current.next;
            }
        }
    }

    public void insertAfter(int value, int newValue) {
        Node newInsertNode = new Node(newValue);
        if (head == null) {
            head = newInsertNode;
        } else {
            Node current = head;
            while (current != null) {
                if (current.value == value) {
                    newInsertNode.next = current.next;
                    current.next = newInsertNode;
                }
                current = current.next;
            }
        }
    }
}