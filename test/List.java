/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author VivoBook
 */
public class List {
     private Node head;
    private Node tail;

    public List() {
        this.head = null;
        this.tail = null;
    }

    public void add(int data) {
        Node newNode = new Node(data);

        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public int remove() {
        if (isEmpty()) {
            throw new IllegalStateException("List is empty!");
        }

        int data = head.data;
        head = head.next;

        if (head == null) {
            tail = null;
        }

        return data;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int get(int index) {
        if (isEmpty()) {
            throw new IllegalStateException("List is empty!");
        }

        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        return current.data;
    }
    
    public int size() {

        int size = 0;
        Node current = head;

        while (current != null) {
            size++;
            current = current.next;
        }

        return size;
    }


    private class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    public static void main(String[] args) {
        List list = new List();

        list.add(10);
        list.add(20);
        list.add(30);

//        System.out.println(list.remove()); 
//        System.out.println(list.remove()); 

        System.out.println(list.get(1)); 

//        list.remove();

        System.out.println("Apakah List kosong? : " + list.isEmpty()); 
        System.out.println("Ukuran List: " + list.size());
    }
}
