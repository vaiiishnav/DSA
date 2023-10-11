package Queues;

public class LearnQueue {
    static class Queue{
        static int[]arr;
        int size;
        int front = -1;

        int rear = -1;
        Queue(int n){
            this.size=n;
            arr = new int[n];
        }
        public boolean isEmpty(){
            return rear==-1;
        }
        public void add(int data){
            if(rear==size-1){
                System.out.println("queue full");
            }
            rear++;
            arr[rear]=data;
        }
        public void dequeue(int data){
            if(isEmpty()){
                System.out.println("Queue empty");
            }
            int front = arr[0];
            for(int i=0;i<rear;i++){
                arr[i]=arr[i+1];
            }
            rear--;
            System.out.println(front);
        }
        public void peek(){
            if(isEmpty()){
                System.out.println("queue empty");
            }
            System.out.println(arr[front]);
        }
        }
}
