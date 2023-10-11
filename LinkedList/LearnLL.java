package LinkedList;

import java.util.*;
public class LearnLL {
    Node head;
    class Node{
        String data;
        Node next;
        
        Node(String data){
            this.data=data;
            this.next=null;
        }
        
    }
    
    public void addFirst(String data){
            Node newNode = new Node(data);
            if(head==null){
                head = newNode;
                return;
            }
            newNode.next=head;
            head=newNode;
        }
        public void addLast(String data){
            Node newNode = new Node( data);
            if(head==null){
                head = newNode;
                return;
            }
            Node currNode = head;
            while(currNode.next!=null){
                currNode = currNode.next;
            }
            currNode.next = newNode;
        }
        public void printLL(){
            if(head==null){
                System.out.println("List is Empty");
            }
            Node currNode = head;
            while(currNode!=null){
                System.out.print(currNode.data+" ");
                currNode = currNode.next;
            }
        }
         public static void main(String[] args) {
        LearnLL list = new LearnLL();
        list.addFirst("this");
        list.addLast("IS A LINKED LIST");
        list.printLL();
    }
    

        }
   



