package com.stackImplementation;

public class StackX {

    //Declaring the attributes
    private int maxSize; //Size of the stack array
    private int stackArray[]; //stack array
    private int top;   //Top of the stack

    //overloaded constructor
    public StackX(int maxsize) {

        //Initialising the attributes
        this.maxSize = maxsize;
        this.stackArray = new int[maxSize];
        this.top = -1; //Top attribute is initially assigned to -1 since the stack array is empty

    }

    //Declaring the functions / methods of the stack class

    public void push(int data) {
        //Checking whether the array is empty
        if (top == maxSize - 1) {
            System.out.println("Stack is full");
        } else {
            //Method 1
            stackArray[++top] = data;

        /* Method 2
            top = top+1;
            stackArray[top]=data;
        */
        }
    }

        public int pop() {
            //Check array empty
            if (top == -1) {
                System.out.println("Array is empty");
                return -99;
            } else {
                return stackArray[top--];
            }
        }

        public int peak(){

            return stackArray[top];

        }

        public boolean isEmpty() {

            return top == -1;

        }

        public boolean isFull() {

            return (top == maxSize-1);

        }


        public static void main (String[]args){

            //Creating a stack instance of size 5
            StackX stack = new StackX(5);

            //Inserting elements to the stack
            stack.push(1);
            stack.push(2);
            stack.push(3);
            stack.push(4);

            //Removing elements from the stack
            while (!stack.isEmpty()) {

                System.out.println(stack.pop()); //All the deleted elements will be displayed

            }




        }
    }

