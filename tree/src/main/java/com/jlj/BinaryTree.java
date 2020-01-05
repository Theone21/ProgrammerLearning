package com.jlj;

/**
 * 二叉树
 */
public class BinaryTree {

    private HeroNode rootNode;

    public BinaryTree(HeroNode rootNode) {
        this.rootNode = rootNode;
    }

    public HeroNode getRootNode() {
        return rootNode;
    }

    public void setRootNode(HeroNode rootNode) {
        this.rootNode = rootNode;
    }

    /**
     * 前序遍历该二叉树
     */
    public void preOrder(){
        if(this.rootNode != null){
            preOrder(this.rootNode);
        } else {
            System.out.println("二叉树为空");
        }
    }

    /**
     * 前序遍历二叉树并查找某个结点
     */
    public HeroNode preOrderAndSearch(int no){
        if (this.rootNode != null){
            return preOrderAndSearch(this.rootNode, no);
        } else {
            return null;
        }
    }

    /**
     * 删除二叉树中结点值等于no的结点
     * @param no 要删除的编号
     * @return boolean 删除成功，返回true, 否则返回false
     */
    public boolean delNode(int no){
        if (this.rootNode != null && this.rootNode.getNo() == no){
            this.rootNode = null;
            return true;
        }
        if (this.rootNode != null){
            return delNode(this.rootNode, no);
        }
        return false;
    }

    private boolean delNode(HeroNode node, int no){
        if (node.getLeft() != null && node.getLeft().getNo() == no){
            node.setLeft(null);
            return true;
        }
        if (node.getRight() != null && node.getRight().getNo() == no){
            node.setRight(null);
            return true;
        }
        boolean flag = false;
        if (node.getLeft() != null){
            flag = delNode(node.getLeft(), no);
        }
        if (!flag && node.getRight() != null){
            flag = delNode(node.getRight(), no);
        }
        return flag;
    }



    private HeroNode preOrderAndSearch(HeroNode node, int no){
        if (node.getNo() == no) {
            return node;
        }
        HeroNode resultNode = null;
        if (node.getLeft() != null){
            resultNode =  preOrderAndSearch(node.getLeft(), no);
        }
        if (resultNode == null && node.getRight() != null){
            resultNode = preOrderAndSearch(node.getRight(), no);
        }
        return resultNode;
    }

    /**
     * 前序遍历，即先输出当前节点，
     *         然后若左子节点不为空，那么对以左子节点为根节点的子树进行前序遍历
     *         最后若右子节点不为空，那么对以右子节点为根节点的子树进行前序遍历
     * @param node 不为空的待遍历节点
     */
    private void preOrder(HeroNode node){
        System.out.println(node);
        if (node.getLeft() != null){
            preOrder(node.getLeft());
        }
        if (node.getRight() != null){
            preOrder(node.getRight());
        }
    }
}
