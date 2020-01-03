package com.jlj.linkedlist;


import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

public class TestList {

    @Test
    public void testAdd(){
        MyLinkedList list = new MyLinkedList();
        list.add(new HeroNode(1, "宋江", null));
        list.add(new HeroNode(3, "张飞", null));
        list.add(new HeroNode(2, "刘备", null));
        Assert.assertEquals(3, list.size);
        System.out.println(list);
        List<String> lists = new LinkedList<>();

    }

    @Test
    public void testAddSort(){
        MyLinkedList list = new MyLinkedList();
        list.addSort(new HeroNode(3, "宋江", null));
        list.addSort(new HeroNode(2, "张飞", null));
        list.addSort(new HeroNode(1, "刘备", null));
        Assert.assertEquals(3, list.size);
        System.out.println(list);
    }
}
