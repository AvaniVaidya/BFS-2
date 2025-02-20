//TC: O(n)
//SC: O(n)
//Did it run on leetcode: Yes
public class Solution_rightSideView {

    public List<Integer> rightSideView(TreeNode root) {

        List<Integer> result = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();

        if(root == null)
            return result;

        q.add(root);
        while(!q.isEmpty()){
            int currLevelChild = q.size();
            for(int i = 0; i < currLevelChild; i++){
                TreeNode curr = q.poll();
                if(i == currLevelChild - 1)
                    result.add(curr.val);
                if(curr.left != null)
                    q.add(curr.left);
                if(curr.right != null)
                    q.add(curr.right);
            }
        }
        return result;
    }

}
