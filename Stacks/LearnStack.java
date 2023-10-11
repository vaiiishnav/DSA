package Stacks;

public class LearnStack {
    
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
     static class Stack{
        public static Node head;
        public static boolean isEmpty(){
            return head==null;
        }
        public static void push(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head=newNode;
            }
            newNode.next = head;
            head = newNode;
    }
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;

        }
        public static void peek(){
            if(isEmpty()){
                System.out.println("stack empty");
            }
            System.out.println(head.data);
        }
        

    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        System.out.println(s.pop()
);         s.peek();
    }
    
    
}
