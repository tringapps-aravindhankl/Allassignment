package assignment.linkedlist;


class Node{
    int data;
    Node next;
    public Node(int value){
        this.data=value;
        this.next=null;
    }
}

public class Queuelist {
	Node head=null;

    public void add(int value){
        if(this.head==null)
        {
            this.head=new Node(value);
        }
        else{
            Node temp=this.head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=new Node(value);
        }
    }
    public void deleteElements(){
        Node n2=this.head;
        this.head=n2.next;
    }
    
    public void print(){
        Node temp=this.head;
        if(temp==null){
            System.out.println("invalid");
        }else{
            while(temp!=null){
                System.out.println(temp.data);
                temp=temp.next;
            }
        }
    }
}