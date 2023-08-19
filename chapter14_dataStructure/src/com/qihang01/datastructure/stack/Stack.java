package com.qihang01.datastructure.stack;

import java.util.ArrayList;

/**
 * ClassName: Stack
 * Package: com.qihang05.stack
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/8/19 15:15
 * @Version 1.0
 */
public class Stack<T> {
    // 向栈当中存储元素，我们这里使用一维数组模拟。存到栈中，就表示存储到数组中。
    // 为什么选择Object类型数组？因为这个栈可以存储java中的任何引用类型的数据
    /*
    用数组实现链表
    * */
    private Object[]  values;
    private int index;
    // 栈帧，永远指向栈顶部元素
    // 那么这个默认初始值应该是多少。注意：最初的栈是空的，一个元素都没有。
    // private int index = 0; // 如果index采用0，表示栈帧指向了顶部元素的上方。
    // private int index = -1; // 如果index采用-1，表示栈帧指向了顶部元素。

    public Stack(int length){
        this.values = new Object[length];
        this.index = 0;
    }
    /*
    入栈
    * */
    public void push(T ele){
        if(index >= values.length){
            throw new RuntimeException("栈满，无法放入");
        }
        this.values[index] = ele;
        this.index ++;
    }
    /*
    * 出栈
    * */
    public T pop(){
        if(index <= 0){
            throw new RuntimeException("栈已空，出栈失败");
        }
        T needValue = (T)values[index - 1];
        values[index - 1] = null;
        index --;
        return needValue;
    }

    /*
    * get set
    * */
    public Object[] getValues() {
        return values;
    }

    public void setValues(Object[] values) {
        this.values = values;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
