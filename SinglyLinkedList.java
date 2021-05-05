
public class SinglyLinkedList {
   Node head;
   
   static class Node{
	   int d;
	   Node nxt;
	   //constructor
	   Node(int n){
		   d=n;
		   nxt=null;		   	   
	   }
   }
   //traverse
   public void getLinkedList() {
	   Node n=head;
	   while (n!=null) {
		   System.out.print(n.d+"->");
		   n=n.nxt;
	   }
   }
   //Add a node in start
   public void addNodeInStart(int data) {
	   Node newNode=new Node(data);
	   newNode.nxt=head;
	   head=newNode;
   }
   //Add a node after a given node
   public void addNodeAfter(Node pre_node,int data) {
	   if(pre_node==null) {
		   System.out.println("previus node null!!");
		   return;
	   }
	   Node newNode=new Node(data);
	   newNode.nxt=pre_node.nxt;
	   pre_node.nxt=newNode;
   }
   //Add a node at the end
   /*Time complexity of append is O(n) where n is the number of nodes in linked list. Since there is a loop from head to end, the function does O(n) work. 
   This method can also be optimized to work in O(1) by keeping an extra pointer to tail of linked list*/
   public void addNodeEnd(int data) {
	   Node newNode=new Node(data);
	   if(head==null) {
		   head.nxt=new Node(data);
	   }
	   newNode.nxt=null;
	   //traverse till last node
	   Node last=head;
	   while(last.nxt!=null) {
		   last=last.nxt;
	   }
	   last.nxt=newNode;
	   return;
   }
   //add nodes in Linked List	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinglyLinkedList l1=new SinglyLinkedList();
		l1.head=new Node(1);
		Node n2=new Node(2);
		Node n3=new Node(3);
		l1.head.nxt=n2;
		n2.nxt=n3;
		l1.addNodeAfter(l1.head.nxt.nxt, 21);
		l1.addNodeInStart(23);
		l1.addNodeEnd(11);
		l1.getLinkedList();
		
	}

}
