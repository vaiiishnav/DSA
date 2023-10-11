package LinkedList;

public class LearnDoublyLL {
    Node head;
    class Node{
        String data;
        Node next;
        Node prev;
        Node(String data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
        public void addFirst(String data){
            Node newNode = new Node(data);
            if(head==null){
                head=newNode;
            }
            
        }
    }
}
