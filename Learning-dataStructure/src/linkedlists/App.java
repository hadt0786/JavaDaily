package linkedlists;

public class App {
	//this is linked list
	public static void main(String[] args) {
		Node nodeA = new Node();
		nodeA.data = 4;
		
		Node nodeB = new Node();
		nodeB.data = 3;
		
		Node nodeC = new Node();
		nodeC.data = 7;
		

		Node nodeD = new Node();
		nodeD.data = 8;
		
		nodeA.next = nodeB;
		nodeB.next = nodeC;
		nodeC.next = nodeD;
		//nodeD.next = nodeB;
		
		System.out.println(listLength(nodeA));//return 4
		System.out.println(listLength(nodeB));//return 3
		
	}

	public static int listLength(Node aNode) {
		
		int length = 0; 
		Node currentNode = aNode;
		
		while(currentNode!=null) {
			length++;
			currentNode = currentNode.next;
		}
		return length;
	}	
}