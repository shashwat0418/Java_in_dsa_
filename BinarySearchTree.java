1 ./ *Maximum Depth of Binary tree */
  /**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int maxDepth(TreeNode root) {
        if( root == null)
            return 0;
        return 1 + Math.max(maxDepth (root.left) , maxDepth(root.right));
        
    }
}

2. /*count complete tree nodes */
class Solution {
    public int countNodes(TreeNode root) {
       if(root == null)
       {
           return 0;
       }
        return 1 + countNodes(root.left) + countNodes(root.right);
    }
}
3. /*Diameter of a Binary tree */
  class Solution {
    int max = 0;
    public int diameterOfBinaryTree(TreeNode root) 
  {
        height(root);
        return max;
    }
        public  int height(TreeNode root)
        {
            if(root == null)
                return 0;
            int left = height(root.left);
            int right = height(root.right);
            max = Math.max(max,left+right);
            return 1 + Math.max(left,right);
        }       
}

4. /*same tree*/
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null)
        return true;
        if(p == null || q == null)
        return false;
        if(p.val != q.val)
            return false;
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
        
        
    }
}

5./*inorder triverse*/
  class Solution {
    public List<Integer> inorderTraversal(TreeNode root) 
    {
        ArrayList<Integer> list = new ArrayList<>();
        dummy(root,list);
        return list;
    }
        private void dummy(TreeNode root , List<Integer>list)
        {
            if(root == null)
        {
            return ;
        }
            dummy(root.left,list);
            list.add(root.val);
            dummy(root.right,list);
        }
}

6./*postorder*/
  class Solution {
    public List<Integer> postorderTraversal(TreeNode root) 
    {
        ArrayList<Integer> list = new ArrayList<>();
        Dummy( root,list);
        return list;
    }
    private void Dummy(TreeNode root , List<Integer>list)
    {
        if(root == null)
            return;
        Dummy(root.left,list);
        Dummy(root.right,list);
        list.add(root.val);
    }
}
