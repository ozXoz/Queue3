package javaapplicationqueue3;

import java.util.Stack;

public class QueueWithTwoStacks {
    Stack<Integer> stack1= new Stack<>();
    Stack<Integer> stack2= new Stack<>();
    // O(1)
    public void enqueue(int item){
        stack1.push(item);
    }
    //  so if the second stack2 is empty move to first stack to second stack2
    //0(n)
    public int dequeue(){
        if(isEmpty())
            throw  new IllegalStateException();
        if(stack2.isEmpty())
            while (!stack1.isEmpty())
                stack2.push((stack1.pop()));

        return stack2.pop();

    }

    public int peek(){
        if(isEmpty())
            throw  new IllegalStateException();
        if(stack2.isEmpty())
            while (!stack1.isEmpty())
                stack2.push((stack1.pop()));

        return stack2.peek();

    }

    public  boolean isEmpty(){
        return  stack1.isEmpty() && stack2.isEmpty() ;
    }




}
