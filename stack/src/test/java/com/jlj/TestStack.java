package com.jlj;

import org.junit.Assert;
import org.junit.Test;

public class TestStack {

    @Test
    public void test1(){
        MyStack<String> myStack = new MyStack<>(10);
        int i = 0;
        while (i++ < 20){
            myStack.push("这个"+i);
        }
        Assert.assertEquals("这个20", myStack.pop());
        Assert.assertEquals("这个19", myStack.pop());
    }
}
