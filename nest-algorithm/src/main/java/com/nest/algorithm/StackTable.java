package com.nest.algorithm;

/**
 * 单链表实现栈表
 */
public class StackTable {

    private Node header;

    private int size;

    public StackTable() {
        header = null;
        size = 0;
    }

    public int getSize() {
        return size;
    }

    /**
     * 押入栈
     * @param data
     */
    public void push(Object data) {
        Node first = new Node(data, header);
        header = first;
        size++;
    }

    public boolean isEmpty() {
        return size == 0 ? true : false;
    }

    /**
     * 弹出栈的首个元素
     *
     * @return
     */
    public Object pop() {
        if (isEmpty()) {
            throw new RuntimeException("错误:链表为空");
        }
        Object data = header.getData();
        header = header.getNext();
        size--;

        return data;
    }

}