import java.util.Stack;
public class Solution
{
  public static void preOrderWithoutRecursion(BinaryTreeNode<Integer>root)
  {
    if (root == null)
    {
      return;
    }
    Stack<BinaryTreeNode<Integer>> s = new Stack<BinaryTreeNode<Integer>>();
    s.add(root);
    while (!s.isEmpty())
    {
      BinaryTreeNode<Integer>frontNode = s.pop();
      System.out.print(frontNode.data);
      if (frontNode.right != null)
      {
        s.push(frontNode.right);
      }
      if (frontNode.left!=null)
      {
        s.push(frontNode.right);
      }
    }
  }
}
