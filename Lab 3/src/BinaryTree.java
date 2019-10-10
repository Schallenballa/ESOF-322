public class BinaryTree {
	
	
	
	
	public class LinkedList {
		//Creates an instance of the first/last items in the list
		EmployeeRecords firstItem;
		EmployeeRecords lastItem;
		//Contains a name, Social Security Number, and a Salary
		class EmployeeRecords{
			//Creates an instance of the next item in the list
			EmployeeRecords nextItem;
			String name;
			int ssn;
			int salary;
			//Constructor to create the object to be linked into the list
			EmployeeRecords(String n, int ss, int s){
				name = n;
				ssn = ss;
				salary = s;
				//Resets the nextItem to null
				nextItem = null;
			}
		}
	}
	
	
	class Node{
		//Integer to be stored in each Node
		int key;
		
		//Creates the left & right child (if exists)
		Node left;
		Node right;
		
		//Constructor for creating a Node
		public Node(int var) {
			key = var;
			left = right = null;
		}
	}
	
	
}
