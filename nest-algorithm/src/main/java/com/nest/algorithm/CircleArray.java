package com.nest.algorithm;

/**
 *
 * 循环数组
 * 为了避免数组的整体移动，可以引入如下两个变量 f 和 r:
 * f:始终等于Q的首元素在数组中的下标，即指向下次出队元素的位置
 * r:始终等于Q的末元素的下标加一，即指向下次入队元素的位置一开始，f = r = 0，此时队空。
 * 每次有对象入队时，将其存放于 Q[r]，然后 r 加一，以指向下一 单元。
 * 对称地，每次有对象出队之后，也将 f 加一，指向新的队首元素。这样，对 front()、enqueue() 和 dequeue()方法的每一次调用都只需常数时间。
 * 然而，这还不够。细心的读者或许已经注意到，按照上述约定，在队列的生命期内，f 和 r 始终 在单调增加。因此，若队列数组的容量为 N，则在经过 N 次入队操作后，r 所指向的单元必然超出 数组的范围;在经过 N 次出队操作后，f 所指向的单元也会出现类似的问题。
 * 解决上述问题的一种简便方法，就是在每次 f 或 r 加一后，都要以数组的长度做取模运算，以 保证其所指单元的合法性。就其效果而言，这就相当于把数组的头和尾相联，构成一个环状结构。
 *
 */
public class CircleArray {

    //默认容量
    public static final int LEN_CAPACITY= 1000;

    //数组实际容量
    protected int capacity;

    //初始数组
    protected Object[] Q;
    //首个元素的位置
    protected int f = 0;
    //最后元素的位置
    protected int r = 0;

    public  CircleArray() {
        this(LEN_CAPACITY);
    }

    public  CircleArray(int initCapacity) {
        capacity = initCapacity;
        Q = new Object[initCapacity];
    }

    /**
     * 没搞懂 为啥这么计算？
     */
    public int getSize() {
        return ((capacity-f+r) % capacity);
    }

    public boolean isEmpty() {
        return f == r;
    }

    /**
     * 入队
     * @param object
     */
    public void enQueue(Object object) {
        if (getSize() == capacity -1 ) {
            throw new RuntimeException("错误：队列满");
        }
        Q[r] = object;
        r = (r+1) % capacity;
    }
    /**
     * 出队
     *
     */
    public Object deQueue() {
        Object element;
        if (isEmpty()) {
            throw new RuntimeException("错误：队列为空");
        }
        element =Q[f];
        Q[f] = null;

        f = (f+1) % capacity;

        return element;
    }


    public Object getFirst() {
        if (isEmpty()) {
            throw new RuntimeException("错误：队列为空");
        }

        return Q[f];
    }

}
