/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;
import exceptions.*;
import java.util.Arrays;

/**
 *
 * @author Ella Hayashi
 * @version 1
 * @since 2017-03-05
 * @param <T>
 */
public class LinkedQueue<T> implements QueueADT<T>{
   
    private SinglyLinkedNode<T> front, rear;
    
    public LinkedQueue()
    {
        front = null;
        rear = null;
    }    
     
    
    /**
    * adds an element to the queue
    */
    @Override
    public void enqueue(T element) 
    {
        SinglyLinkedNode<T> node = new SinglyLinkedNode<T>(element);
        
        if (isEmpty()){
            front = node;
        }
        else{
            rear.setNext(node);
        }        
        rear = node;                
    }

    /**
    *takes an element away from the queue
    *
    * @return the element removed
    */
    @Override
    public T dequeue() throws EmptyQueueException {
        if(isEmpty())
        {
        throw new EmptyQueueException("Queue is empty"); 
    
        }
        T result = front.getElement();
        front = front.getNext();
        
        if(isEmpty()){
            rear = null;
        }
        return result;        
    }

    /**
    *finds the first element of the queue and returns it
    *
    * @return the first element
    */
    @Override
    public T first() throws EmptyQueueException {
        if(isEmpty()){
        throw new EmptyQueueException("Queue is empty"); 
        }   
        return front.getElement();       
    }    

   /**
    * Returns true if this container contains no elements
    *
    * @return boolean value that indicates if container is empty or not
   */    
    @Override
    public boolean isEmpty() {
        
        if(front == null)
        {
         return true;
        }
        else
        {
            return false;
        }   
    }

    /**
     * finds the number of elements in the queue
     * 
     * @return the number of elements in the queue
     */
    @Override
    public int size() 
    {
        int counter;
        if(isEmpty())
        {
            counter = 0;
        }
        else
        {
            counter = 1;
            SinglyLinkedNode<T> temp =  new SinglyLinkedNode<T>();
            temp = front;
            while(temp!=null)
            {
                temp = temp.getNext();
                counter++;
            }            
        }            
        return counter;
    }  

    /**
     * makes a string representation of the elements in the queue
     * 
     * @return a string representation of the element
     */
    public String toString(){
        
        String result = "";
        SinglyLinkedNode<T> temp = front;
        while(temp!=null)
        {
            result = result + (temp.getElement()).toString() + "/n";
            temp = temp.getNext();            
        }
        
        return result;              
    }  

}
