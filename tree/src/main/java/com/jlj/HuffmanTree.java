package com.jlj;

import java.util.*;

/**
 * 赫夫曼树
 */
public class HuffmanTree {


    /**
     * 生成赫夫曼树
     * @param arr 数组
     * @return 赫夫曼树的头结点
     */
    public static HeroNode createHuffman(int[] arr){
        List<HeroNode> nodes = new ArrayList<>();
        for(int item : arr){
            nodes.add(new HeroNode(item));
        }

        while (nodes.size() > 1){
            Collections.sort(nodes);
            HeroNode temp = new HeroNode(nodes.get(0).getNo() + nodes.get(1).getNo());
            temp.setLeft(nodes.get(0));
            temp.setRight(nodes.get(1));
            nodes.remove(0);
            nodes.remove(0);
            nodes.add(temp);
        }
        return nodes.get(0);
    }

    private static void getDistance(HeroNode heroNode){

    }



    public static void main(String[] args) {
        int[] arr = new int[]{50, 18, 10, 12, 23, 99, 2};
        // 根据数组生成赫夫曼树
        HeroNode headNode = createHuffman(arr);
        // 设置每个结点的路径
        headNode.setDistance("");
        // 获取叶子结点的路径

        Map<Integer, String> m = new HashMap<>();




    }
}
