package com.Graph;

import com.Queue.QueueEmptyException;
import com.Queue.QueueUsingLL;


import java.util.Scanner;

public class BFS
{
    public static void printHelper(int edges[][],int sv,boolean visited[]) throws QueueEmptyException {

        QueueUsingLL<Integer> q = new QueueUsingLL();
        q.enqueue(sv);
        visited[sv] = true;
        while (!q.isEmpty()) {
            int front;
            try {
                front = q.dequeue();
            }catch (QueueEmptyException e){
                return;
            }
            System.out.println(front);
            for(int i=0;i< edges.length;i++)
            {
                if(edges[front][i]==1 && !visited[i])
                {
                    q.enqueue(i);
                    visited[i]=true;
                }
            }

        }
    }
    public static void print(int edges[][]) throws QueueEmptyException {
        boolean visited[]=new boolean[edges.length];
        for(int i=0;i< edges.length;i++)
        {
            if(!visited[i])
            {
                printHelper(edges,i,visited);
            }
        }
    }
    public static void main(String[] args) throws QueueEmptyException {
        int n;
        int e;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        e=sc.nextInt();
        int edges[][]=new int[n][n];
        for(int i=0;i<e;i++)
        {
            int fv= sc.nextInt();
            int sv= sc.nextInt();
            edges[fv][sv]=1;
            edges[sv][fv]=1;
        }
        print(edges);
    }
}
