package com.nest.algorithm;

/**
 * 双向队列： Double-end Queue
 */
public interface DeQueue {

    int getSize();
    boolean isEmpty();
    Object getFirst() throws Exception;
    Object getLast() throws Exception;
    void insertFirst(Object object) throws Exception;
    void insertLast(Object object) throws Exception;
    Object removeFirst() throws Exception;
    Object removeLast() throws Exception;
    void traversal();
}
