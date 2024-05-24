/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author VivoBook
 */
public class Stack {
     private Node top;

    public Stack() {
        this.top = null;
    }

    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty!");
        }

        int data = top.data;
        top = top.next;

        return data;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty!");
        }

        return top.data;
    }
    
    public int size() {

        int size = 0;
        Node current = top;

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
        Stack stack = new Stack();

        stack.push(10);
        stack.push(20);
        stack.push(30);

//        System.out.println(stack.pop()); 
//        System.out.println(stack.pop()); 

        System.out.println(stack.peek()); 

//        stack.pop();

        System.out.println("Apakah Stack kosong? : " + stack.isEmpty()); 
        System.out.println("Ukuran Stack : " + stack.size());
    }
    
}
