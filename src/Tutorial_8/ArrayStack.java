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


//
import java.util.EmptyStackException;

/**
 *
 * @author klaus
 */
public class ArrayStack 
{
    
    public static final int INITIAL_CAPACITY = 15;
    
    private int[] items;
    
    private int size;
    
    public ArrayStack()
    {
        items = new int[INITIAL_CAPACITY];
        size = 0;
    }
    
    public void push(int newItem)
    {
        // TODO complete code
        if (isFull())
            throw new EmptyStackException();
        items[size] = newItem;
        size++;
    }
    
    public int pop()
    {
        // TODO complete code
         if (isFull())
            throw new EmptyStackException();
         size--;
         return items[size];
        
    }

    public void clear()
    {
        // TODO complete code
        size = 0;
    }

    public String toString()
    {
        // TODO complete code
        String s = " [ ";
        for(int i = 0; i<size; i++){
            s += items[i];
            s += " ";
        }
        s += "]" ;
        return s;
    }

    public int top(){
        if(isEmpty())
            throw new EmptyStackException();
        return items[size-1];
    }
    
    public int size()
    {
        // TODO complete code
        return size;
    }

    public boolean isEmpty()
    {
        // TODO complete code
        return (size == 0);
        
    }
    
    public boolean isFull()
    {
        // TODO complete code
        return (size == INITIAL_CAPACITY);
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
