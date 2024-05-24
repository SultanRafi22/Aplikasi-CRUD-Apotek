/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author VivoBook
 */
public class Queue {
    private Node head;
    private Node tail;

    public Queue() {
        head = null;
        tail = null;
    }

    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (tail != null) {
            tail.next = newNode;
        }
        tail = newNode;
        if (head == null) {
            head = newNode;
        }
    }

    public int dequeue() {
        if (head == null) {
            return -1;
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

    public int peek() {
        if (head == null) {
            return -1;
        }
        return head.data;
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
            next = null;
        }
    }
    
    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(100); 
        queue.enqueue(1); 

//        System.out.println(queue.dequeue()); 
//        System.out.println(queue.dequeue()); 

        System.out.println(queue.peek());

//        queue.dequeue();

        System.out.println("Apakah antrian kosong: ? " + queue.isEmpty());
        System.out.println("Jumlah elemen pada antrian : " + queue.size()); 

    }
}
