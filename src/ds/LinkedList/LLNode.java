package ds.LinkedList;

// This Class defines the structure of a node in the linked list 

public class LLNode {
	
	int value;
	LLNode nextNode = null;
	
	public LLNode(int value,LLNode nextNode){
		this.value=value;
		if(nextNode != null){
			this.nextNode=nextNode;
		}
	}
	
	public LLNode(){
		this.value=0;
		this.nextNode=null;
	}
	
	public LLNode(int value){
		this.value=value;
		this.nextNode=null;
	}

}
