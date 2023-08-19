package com.qihang04.Tree.TreeTest;

import org.junit.Test;

/**
 * ClassName: Node
 * Package: com.qihang04.Tree.TreeTest
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/8/19 14:55
 * @Version 1.0
 */
public class TreeNode<T> {
   TreeNode lift;
   TreeNode right;
   T data;

    public TreeNode(T data) {
        this.data = data;
        this.lift = null;
        this.right = null;
    }

    public TreeNode(TreeNode lift, TreeNode right, T data) {
        this.lift = lift;
        this.right = right;
        this.data = data;
    }
}
class Tree{
    @Test
    public void test(){

        TreeNode node1 = new TreeNode(null, null,"AA" );
        TreeNode leftNode = new TreeNode(null, null,"BB");
        TreeNode rightNode = new TreeNode(null,null,"CC" ) ;
        node1.lift = leftNode ;
        node1.right = rightNode;
    }


}
