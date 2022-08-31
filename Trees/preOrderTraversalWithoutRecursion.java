public class Solution {

	public static void preOrder(BinaryTreeNode<Integer> root) {
		//Your code goes here
        if (root == null)
        {
            return ;
        }
        
        Stack<BinaryTreeNode<Integer>> s = new Stack<BinaryTreeNode<Integer>>();
        s.add(root);
        
        while (!s.isEmpty())
        {
            BinaryTreeNode<Integer>frontNode = s.pop();
            System.out.print(frontNode.data+" ");
            
            if(frontNode.right!=null)
            {
                s.push(frontNode.right);
            }
            if (frontNode.left!=null)
            {
                s.push(frontNode.left);
            }
        }
	}
}
