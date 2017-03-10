package ds.LinkedList;

public class LinkedList {

	int nodeCount=0;
	LLNode node=null;
	
	LLNode ptr2FirstNode=null; // Head
	
	public LinkedList(){
		super();
	}
	
	public void addNode2LList(int val){
		//Check if its the first node
		if(ptr2FirstNode == null){
            node=new LLNode(val);
            ptr2FirstNode=node;
			nodeCount++;
			System.out.println("Added First Node in the Linked List");
			return;
		}
		System.out.println("Gonna Create Additional nodes !");
		LLNode tmpPtr=ptr2FirstNode;
		
		while(tmpPtr.nextNode != null){
			tmpPtr=tmpPtr.nextNode;
		}
		LLNode newNode=new LLNode(val);
		tmpPtr.nextNode=newNode;
		nodeCount++;
		System.out.println("Created "+ nodeCount+" Nodes.");
		
	}
	
	public void positionNode2LList(int reqPosition,int val){
		
		if(reqPosition ==0){
			System.out.println("1st position of the linked list is 1.Exit");
			return;
		}
		//Check if the list is empty. If empty invoke the normal method addNode2List()
		if(nodeCount==0 || reqPosition==(nodeCount+1)){
			addNode2LList(val);
			return;
		}
		// Logic to add the given node if there is at least one node in the List
		// Check if the requested position is valid or not
		// Client can ask to add a node at position 3 when the LList has only one node
		// Below code snippet gets executed only if there is at least one node in the LList
		if(reqPosition >= (nodeCount+2)){
			System.out.println("Invalid Position. The LList has already only "+nodeCount+" nodes.");
			return;
		}
		else{
			LLNode navgPtr=ptr2FirstNode;
			int positionCounter=1;
			
			// Request to place the node as first node in an already non-empty list
			
			if(reqPosition==1){
				LLNode newNode=new LLNode(val);
				newNode.nextNode=ptr2FirstNode;
				ptr2FirstNode=newNode;
				return;
			}
			
			while(positionCounter < (reqPosition-1)  ){
				navgPtr=navgPtr.nextNode;
				positionCounter++;
			}
			//test
			System.out.println("positionCounter ::"+positionCounter);
			System.out.println("pointer pointing node with value  "+navgPtr.value);
			
			LLNode newNode=new LLNode(val);
			newNode.nextNode=navgPtr.nextNode;
			navgPtr.nextNode=newNode;
		}
		
	}
	
	public void displayLList(){
		
		LLNode navgPtr=ptr2FirstNode;
		
		// If there are are no nodes, display message and exit
		if(nodeCount==0){
			System.out.println("There are no nodes in the linked list. Exit !");
			return;
		}
		else{
			if(nodeCount==1){
				System.out.println("Data in the one and only node is :: "+ptr2FirstNode.value);
				return;
			}
			else{
				while(navgPtr!=null){
					System.out.println("Data in Node is :: "+navgPtr.value);
					navgPtr=navgPtr.nextNode;
				}	
			}			
		}
	}
	
}
