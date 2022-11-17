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
import java.util.ArrayList;
import java.util.Stack;
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
       TreeNode pointer = root;
       ArrayList<Integer> sol = new ArrayList<>();
       Stack<TreeNode> st = new Stack<>();

       while(pointer != null || !st.isEmpty()) {
           if(pointer != null) {
               st.push(pointer);
               pointer = pointer.left;
           }
           else {
               pointer = st.pop();
               sol.add(pointer.val);
               pointer = pointer.right;
           }
       }
       return sol;
    }
}