package com.jlj;

import java.util.Arrays;
import java.util.List;

public class Test {

    public static void main(String... args){
        HeroNode node1 = new HeroNode(1, "宋江");
        HeroNode node2 = new HeroNode(2, "吴用");
        HeroNode node3 = new HeroNode(3, "卢俊义");
        HeroNode node4 = new HeroNode(4, "林冲");
        HeroNode node5 = new HeroNode(5, "关胜");

//        node1.setLeft(node2);
//        node1.setRight(node3);
//        node3.setLeft(node4);
//        node4.setRight(node5);
//
//        preOrder(node1);
        List<HeroNode> list = Arrays.asList(node1, node2, node3, node4, node5);


    }

    private static void preCreateTree(HeroNode node){

    }

    /**
     * 前序遍历，即先输出当前节点，
     *         然后若左子节点不为空，那么对以左子节点为根节点的子树进行前序遍历
     *         最后若右子节点不为空，那么对以右子节点为根节点的子树进行前序遍历
     * @param node 不为空的待遍历节点
     */
    private static void preOrder(HeroNode node){
        System.out.println(node);
        if (node.getLeft() != null){
            preOrder(node.getLeft());
        }
        if (node.getRight() != null){
            preOrder(node.getRight());
        }
    }
}
