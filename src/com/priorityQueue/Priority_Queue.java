package com.priorityQueue;

import java.util.ArrayList;

public class Priority_Queue {
    private ArrayList<Integer>heap;
    public Priority_Queue()
    {
        heap= new ArrayList<>();

    }
    boolean isEmpty()
    {
        return heap.size()==0;

    }
    int size()
    {
        return heap.size();
    }
    int getMin()
    {
        //heap is empty
        if(isEmpty())
        {
            new priorityQueueException();
        }
        return heap.get(0);
    }
    void insert(int element)
    {
        heap.add(element);
        int childIndex=heap.size()-1;
        int parentIndex=(childIndex-1)/2;
        while(childIndex>0)
        {
            if(heap.get(childIndex)<heap.get(parentIndex))
            {
                int temp=heap.get(childIndex);
                heap.set(childIndex,heap.get(parentIndex));
                heap.set(parentIndex,temp);
                childIndex=parentIndex;
                parentIndex=(childIndex-1)/2;
            }else {
                return;
            }
        }

    }
    int removeMin()
    {

    }
}