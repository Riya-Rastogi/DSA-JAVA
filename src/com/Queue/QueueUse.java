package com.Queue;

public class QueueUse {
    public static void main(String[] args)  {
//       QueueUsingLL<Integer> queue=new QueueUsingLL<>();
//        for(int i=0;i<=5;i++)
//        {
//            queue.enqueue(i);
//        }
//        while(!queue.isEmpty())
//        {
//            try{
//                System.out.println(queue.dequeue());
//            }
//            catch(QueueEmptyException e)
//            {
//                e.printStackTrace();
//            }
//        }
        QueueUsingArray queue=new QueueUsingArray();
        int arr[]={10,20,30,40};
        for(int elem:arr)
        {
            try {
                queue.enqueue(elem);
            } catch (QueueFullException e) {
//                throw new RuntimeException(e);
            }
        }
        while(!queue.isEmpty())
        {
            try {
                System.out.println(queue.dequeue());
            } catch (QueueEmptyException e) {
//                throw new RuntimeException(e);
            }
        }
    }
}
