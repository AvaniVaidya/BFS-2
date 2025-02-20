//TC: O(n)
//SC: O(n)
//Did it run on leetcode: Yes
public class Solution_isCousins {

    public boolean isCousins(TreeNode root, int x, int y) {
        if(root == null)
            return false;

        boolean xfound;
        boolean yfound;
        TreeNode xparent;
        TreeNode yparent;

        Queue<TreeNode> q = new LinkedList<>();

        q.add(root);

        while(!q.isEmpty()){
            int size = q.size();
            xfound = false;
            yfound = false;
            xparent = null;
            yparent = null;
            for(int i = 0; i < size; i++){
                TreeNode curr = q.poll();
                if(curr.left != null){
                    if(curr.left.val == x){
                        xfound = true;
                        xparent = curr;
                    }
                    if(curr.left.val == y){
                        yfound = true;
                        yparent = curr;
                    }
                    q.add(curr.left);
                }
                if(curr.right != null){
                    if(curr.right.val == x){
                        xfound = true;
                        xparent = curr;
                    }
                    if(curr.right.val == y){
                        yfound = true;
                        yparent = curr;
                    }
                    q.add(curr.right);
                }
            }
            if(xfound && yfound)
                return xparent != yparent;

            if(xfound || yfound)
                return false;
        }
        return false;
    }

}
