package com.jlj;


import java.util.Arrays;

/**
 * 使用数组来模拟实现栈
 */
public class MyStack<T> {

    private Object[] data;
    private int top;

    public MyStack(int initCapticy){
        data = new Object[initCapticy];
        top = -1;
    }

    public void push(T element){
        if(top+1 > data.length-1) grow();
        data[++top] = element;
    }

    public T pop(){
        if(top == -1)
            throw new RuntimeException("没有数据可移");
        return (T) data[top--];
    }

    /**
     * 扩容数组，将数组扩容为当前数组
     */
    private void grow(){
        data = Arrays.copyOf(data, data.length * 2);
    }

}
