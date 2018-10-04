/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queueproject;

/**
 *
 * @author Francisco
 */
public class QueueImpl<T> implements IQueue<T> {

    private T[] list;
    private int size;
    
    public QueueImpl()
    {
        size = 0;
        list = (T[])new Object[0];
    }
    
    @Override
    public void enqueue(T elem) {
        T[] temp = (T[]) new Object[++size];
        for(int i = 0;i<list.length;i++)
        {
            temp[i] = list[i];
        }
        temp[size-1] = elem;
        list = temp;
    }

    @Override
    public T dequeue() {
        T[] temp = (T[]) new Object[--size];
        for(int i = 0;i<size;i++)
        {
            temp[i] = list[i+1];
        }
        T tempElem = list[0];
        list = temp;
        return tempElem;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }
    
    @Override
    public String toString(){
        String out = "";
        for(T elem : list)
        {
            out += elem + "\n";
        }
        return out;
    }
}
