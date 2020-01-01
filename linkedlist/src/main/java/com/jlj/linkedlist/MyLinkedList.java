package com.jlj.linkedlist;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

public class MyLinkedList {

    private HeroNode headNode;
    public int size;

    public MyLinkedList(){
        headNode = new HeroNode();
        size = 0;
    }

    /**
     * 在单链表的尾部添加节点
     * @param newNode
     */
    public void add(HeroNode newNode) {
        HeroNode temp = headNode;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        size++;
    }

    /**
     * 按照顺序添加节点
     * @param newNode
     */
    public void addSort(HeroNode newNode){
        HeroNode temp = headNode;
        int no = newNode.getNo();
        while (temp.next != null){
            if(temp.getNo() <= no && temp.next.getNo() > no){
                break;
            }
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }



    /**
     * 反转当前链表，返回一个新的链表
     */
    public MyLinkedList reserveList(){

        return null;
    }

    @Override
    public String toString() {
        return "MyLinkedList{" +
                "headNode=" + headNode +
                '}';
    }

    // 其余代码示例见 https://www.cnblogs.com/theone67/p/11454178.html


}

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
class HeroNode{
    private int no;
    public String name;
    public HeroNode next;
}
