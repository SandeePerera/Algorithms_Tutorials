package Tutorial_8;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * 5SENG001W Algorithms
 * Week 8
 * Tutorial Exercises: Stacks
 */

//package queue;

import java.util.EmptyStackException;

/**
 *
 * @author klaus
 */

public class ListQueue 
{
    public class Node
    {
        public int data;

        public Node next;

        public Node(int d, Node n)
        {
            data = d;
            next = n;
        }
    }
    
    Node first, last;
    
    public ListQueue()
    {
        first = null;
        last = null;
    }
    
    public void queue(int d)
    {
       // TODO complete code 
        Node n = new Node (d,null);
        if(isEmpty())
            first = n;
        else
            last.next = n;
        last = n;
    }

    public int dequeue()
    {
       // TODO complete code 
        if(isEmpty())
            throw new EmptyStackException();
        int result = first.data;
        first = first.next;
        return result;
    }
    
    public void clear()
    {
        // TODO complete code 
        first = null;
        last = null;
    }

    public int length()
    {
        // TODO complete code
        Node n = first;
        int counter =0;
        while(n != null){
            n = n.next;
            counter++;            
        }
        return counter;
    }

    public boolean isEmpty()
    {
        // TODO complete code  
        return (first == null);
    }    

    public String toString()
    {
        // TODO complete code
        Node n = first;
        String q = "[ ";
        while(n != null){
            q += n.data;
            q += " ";
            n = n.next;
        }
        q += "]";
        return q;
    }

    public int front()
    {
        // TODO complete code
        if(isEmpty())
            throw new EmptyStackException();
        return first.data;
    }

    public int last()
    {
        // TODO complete code
         if(isEmpty())
            throw new EmptyStackException();
        return last.data;
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayStack s = new ArrayStack();
        System.out.println("Stack contents "+s.toString());
        s.push(15);
        System.out.println("Stack contents "+s.toString());
        s.push(7);
        System.out.println("Stack contents "+s.toString());
        s.push(4);
        System.out.println("Stack contents "+s.toString());
        s.pop();
        System.out.println("Stack contents "+s.toString());
        s.push(3);
    }
    
}
