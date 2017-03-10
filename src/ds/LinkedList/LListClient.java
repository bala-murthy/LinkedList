package ds.LinkedList;

public class LListClient {

	public static void main(String[] args) {
		
		LinkedList myLList=new LinkedList();
	
		// Test Client as on 10-March
		/*
		System.out.println("ptr2FirstNode Value is :: "+myLList.ptr2FirstNode);
		myLList.displayLList();
		myLList.addNode2LList(10);
		System.out.println("ptr2FirstNode Value is :: "+myLList.ptr2FirstNode.toString());
		myLList.displayLList();
		myLList.addNode2LList(20);
		System.out.println("ptr2FirstNode Value is :: "+myLList.ptr2FirstNode.toString());
		myLList.addNode2LList(30);
		System.out.println("ptr2FirstNode Value is :: "+myLList.ptr2FirstNode.toString());
		myLList.displayLList();
		myLList.addNode2LList(40);
		System.out.println("ptr2FirstNode Value is :: "+myLList.ptr2FirstNode.toString());
		myLList.displayLList();*/
		
		// New Test Client on 10-Mar
		// Add 3 nodes
		// display
		// try to insert node between 2 and 3
		
/*		LinkedList myLList=new LinkedList();	
		System.out.println("ptr2FirstNode Value is :: "+myLList.ptr2FirstNode);
		myLList.displayLList();
		myLList.addNode2LList(10);
		System.out.println("ptr2FirstNode Value is :: "+myLList.ptr2FirstNode.toString());
		myLList.displayLList();
		myLList.addNode2LList(20);
		System.out.println("ptr2FirstNode Value is :: "+myLList.ptr2FirstNode.toString());
		myLList.addNode2LList(30);
		myLList.displayLList();
		
		// add node between 2nd and 3rd node 
		myLList.positionNode2LList(3, 300);
		myLList.displayLList();
		
		// Check for incorrect Position
		myLList.positionNode2LList(8, 100000);*/
		
		//try to insert at position 0 
		myLList.positionNode2LList(1, 100);
		myLList.positionNode2LList(2, 300);
		myLList.positionNode2LList(1, 1000);
		myLList.positionNode2LList(1, 2000);
		myLList.displayLList();
		

	}

}
