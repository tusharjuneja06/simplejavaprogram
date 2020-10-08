public class BinTree {
    public TreeNode invertTree(TreeNode A) {
        Queue<TreeNode> q=new LinkedList<TreeNode>();
        q.add(A);
        TreeNode a;
        TreeNode l=null;
        TreeNode r=null;
        while(!q.isEmpty()){
            a=q.remove();
            l=a.left;
            r=a.right;
            a.right=l;
            a.left=r;
            if(r!=null){
                q.add(r);
            }
           if(l!=null){
                q.add(l);
           }
        }
        return A;
    }
}
