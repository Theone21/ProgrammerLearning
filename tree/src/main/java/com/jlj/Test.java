package com.jlj;

public class Test {

    public static void main(String... args){
        HeroNode node1 = new HeroNode(1, "宋江");
        HeroNode node2 = new HeroNode(2, "吴用");
        HeroNode node3 = new HeroNode(3, "卢俊义");
        HeroNode node4 = new HeroNode(4, "林冲");
        HeroNode node5 = new HeroNode(5, "关胜");

        node1.setLeft(node2);
        node1.setRight(node3);
        node3.setLeft(node4);
        node4.setRight(node5);

        BinaryTree binaryTree = new BinaryTree(node1);
//        binaryTree.preOrder();

//        System.out.println(binaryTree.preOrderAndSearch(6));

        System.out.println("删除前遍历二叉树，得到结果：");
        binaryTree.preOrder();
        binaryTree.delNode(10);
        System.out.println("删除后遍历二叉树，得到结果：");
        binaryTree.preOrder();


    }

    private static void preCreateTree(HeroNode node){

    }
}
