package l1;

public class Linkedlist {

    static class Node{
    	int data;
    	Node next;
    	Node(int d){
    		data=d;
    		next=null;
    	}
    }
	  Node head;
    static Linkedlist insert(Linkedlist list,int value) {
    	Node newnode=new Node(value);
    	newnode.next=null;
    	if(list.head==null) {
    		list.head=newnode;
    	}
    	else {
    		Node last=list.head;
    		while(last.next!=null) {
    			last=last.next;
    		}
    			last.next=newnode;
    		}
    	return list;
    	}
    static void printlist(Linkedlist list) {
    	Node current=list.head;
    	while(current.next!=null){
    		System.out.print(current.data+" ");
    		current=current.next;
    	}
    	System.out.println();
    }
    static Linkedlist delete(Linkedlist list,int data) {
    	Node current=list.head,prev=null;
    	while(current!=null) {
    		if(current.data==data) {
    			
    		System.out.println("dat found "+current.data+" deleted");
    		prev.next=current.next;
    		break;
    		}
    		else {
    			prev=current;
    			current=current.next;
    		}
    	}
    	if(current==null) {
    		System.out.println("data not found");
    	}
    	return list;
    }
    static Linkedlist deleteat(Linkedlist list,int key) {
    	Node current=list.head;
    	if(key==0) {
    		list.head=current.next;
    	}
    	return list;
    }
    public static void main(String a[]) {
    	Linkedlist list=new Linkedlist();
    	list=insert(list,1);
    	list=insert(list,2);
    	list=insert(list,3);
    	list=insert(list,4);
    	list=insert(list,5);
    	printlist(list);
    	list=delete(list,8);
    	printlist(list);
    	list=deleteat(list,0);
        printlist(list);
    }
    
}
