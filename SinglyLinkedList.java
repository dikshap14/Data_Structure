
class Node {
     int data;
     Node next;
}

class LinkedList {
     Node head;
     //Insert at End
     public void insert(int data){
    	 //create an object of Node class i.e a new node will be created whenever insert function is called
    	 Node node = new Node();
    	 node.data = data; 
    	 node.next = null;
    	 //To check if the node we are creating is the first node 
    	 if(head==null){
    		 head = node;
    	 }
    	 else{
    		 Node n = head;
    		 //traversing the list to find out the last node
    		 while(n.next!=null){
    			 n = n.next; //shifting to the next node
    		 }
    		 //we got the last node of the list, now this node will point to the node we created
    		 n.next = node;
    	 }
    	 
     }
     
     //Insert at  start
     public void insertAtStart(int data){
           Node node=new Node();
           node.data = data;
           node.next = null;
           node.next = head;
           head = node;
     }
     
     //Insert at any index
     public void insertAt(int index, int data){
    	 Node node = new Node();
    	 node.data = data;
    	 node.next = null;
    	 
    	 Node n=head;
    	 //traversing till the node at index-1 position 
    	 
    	 if(index==0){
    		 insertAtStart(data);
    	 }
    	 else{
    		 for(int i=0;i<index-1;i++){
        		 n = n.next;//shifting to next node
        	 }
        	 node.next = n.next;
    		 n.next=node;
    	 }
    	 
     }
     
     //Delete from any index
     public void deleteAt(int index){
    	 if(index==0){
    		 head=head.next;
    	 }
    	 else{
    		 Node n=head;
    		 Node n1=null;
    		 for(int i=0;i<index-1;i++){
    			 n=n.next;
    		 }
    		 n1=n.next;
    		 n.next=n1.next;
    		 //System.out.println("n1"+" "+ n1.data);
    	     n1=null;
    	 }
     }
     //Display data
     public void show(){
    	 Node node = head;
    	 while(node.next!=null){
    		 System.out.println(node.data);
    		 node = node.next;
    	 }
    	 System.out.println(node.data);
     }
}

public class SinglyLinkedList {

	public static void main(String[] args) {
		 LinkedList list=new LinkedList();
	     list.insert(18);
	     list.insert(45);
	     list.insert(12);
	     list.insertAtStart(25);
	     list.insertAt(2, 55);
	     list.insertAt(0, 33);
	     list.deleteAt(2);
	     list.show();

	}

}
