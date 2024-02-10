package DSA.Tree;

import java.util.ArrayList;
import java.util.Collections;

public class LeastCommonAncestor {
    /*
    Find the lowest common ancestor in an unordered binary tree A, given two values, B and C, in the tree.
    Lowest common ancestor: the lowest common ancestor (LCA) of two nodes and w in a tree or directed acyclic graph (DAG)
    is the lowest (i.e., deepest) node that has both v and w as descendants.
    */

    ArrayList< TreeNode > first = new ArrayList<TreeNode>();
    ArrayList< TreeNode > second = new ArrayList<TreeNode>();
    public boolean preorder(TreeNode A, int B){
        if(A == null) return false;

        if(A.val == B){
            first.add(A);
            return true;
        }
        if( preorder(A.left, B) || preorder(A.right, B) ){
            first.add(A);
            return true;
        }
        // we should return false at last becuae if element is not present ;
        return false;
    }

    public int lca(TreeNode A, int B, int C) {

        // finding path for first element B using recursion;
        preorder(A, B);
        // finding path for first element B using recursion;
        preorder(A, C);
        // if there is no element present in this case we return -1;
        int commanAncestor = -1;

        // we collect path from element to root, so we need to reverse the the array;
        Collections.reverse(first);
        Collections.reverse(second);

        int min = Math.min(first.size(), second.size());

        for(int i = 0; i < min; i++){
            // if both element present in tree then there root node will be common Ancestor;
            if(first.get(i) == second.get(i)){
                // updating evert time common node; as node not match will break the loop;
                commanAncestor = first.get(i).val;
            }

            else break;
        }
        return commanAncestor;
    }
}
