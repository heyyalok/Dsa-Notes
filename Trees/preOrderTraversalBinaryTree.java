//PreOrder Traversal 
public class Solution
{
  public staic void PreOrder(BinaryTreeNode<Integer>root)
  {
    if (root == null)
    {
      return;
    }
    System.out.print(root.data);
    preOrder(root.left);
    oreOrder(root.right);
  }
}
