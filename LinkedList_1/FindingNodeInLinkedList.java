/****************************************************************

	Following is the class structure of the Node class:

	class LinkedListNode<T> {
    	T data;
    	LinkedListNode<T> next;
    
    	public LinkedListNode(T data) {
        	this.data = data;
    	}
	}

*****************************************************************/
// Coding Ninja 
public class Solution {
	public static int findNode(LinkedListNode<Integer> head, int n) {
		// Write your code here.
        
        // refer to data structure book page no 5.10
        
        int count = 0;
        LinkedListNode<Integer>temp = head;
        while (temp != null)
        {
            if (temp.data.equals(n))
            {
                return count;
            }
            temp  = temp.next;
            count = count+1;
        }
        return -1;
	}
}
