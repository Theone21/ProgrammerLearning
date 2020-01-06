package com.jlj;


/**
 * 这个是二叉树中的结点
 */
public class HeroNode implements Comparable<HeroNode> {

    private int no;
    private String name;
    private HeroNode left;
    private HeroNode right;
    private String distance;                    // 从根结点到当前结点的路径

    public HeroNode(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public HeroNode(int no) {
        this.no = no;
    }

    /**
     * 前序遍历
     */
    public void preOrder(){
        System.out.println(this);
        if (this.left != null){
            this.left.preOrder();
        }
        if (this.right != null){
            this.right.preOrder();
        }
    }

    public void setDistance(String distance){
        this.distance = distance;
        if(this.left != null){
            this.left.setDistance(distance + "0");
        }
        if(this.right != null){
            this.right.setDistance(distance + "1");
        }
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HeroNode getLeft() {
        return left;
    }

    public void setLeft(HeroNode left) {
        this.left = left;
    }

    public HeroNode getRight() {
        return right;
    }

    public void setRight(HeroNode right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "HeroNode{" +
                "no=" + no +
                ", name='" + name + '\'' +
                (this.left == null && this.right == null ?  "叶子结点" : "非叶子结点") +
                ", 路径为" + this.distance +
                '}';
    }

    @Override
    public int compareTo(HeroNode o) {
        return this.no - o.no;
    }
}
