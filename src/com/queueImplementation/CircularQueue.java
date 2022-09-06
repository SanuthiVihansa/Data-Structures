package com.queueImplementation;

public class CircularQueue {

    //Declaring the attributes

    private int rear;
    private int front;
    private int maxSize;
    private String  [] queueArray;
    private int numberOfElements;

    //overloaded constructor
    public CircularQueue (int size) {

        //Initialising the attributes
        this.rear = -1;
        this.front = 0;
        this.maxSize = size;
        this.queueArray = new String [maxSize];
        this.numberOfElements = 0;

    }

    public void Insert(String data) {

        //check if the queue is full
        if (rear == maxSize-1) {
            System.out.println("Queue is full");
        } else {
            numberOfElements++;
            queueArray[++rear] = data;
        }


    }

    public String remove() {
        //check if the queue is empty
        if (numberOfElements == 0){
            System.out.println("queue empty");
        }else {
            String temp = queueArray [front++];
            numberOfElements --;

            if (front == maxSize)
                front = 0;

            return temp;
        }
        return String.valueOf(-99);
    }

    public void displayQueue (){

        for (int x = 0 ; x < 6 ; x++ ){

            System.out.println(queueArray [x]);
        }

    }

    public Boolean isEmpty () {
        return (numberOfElements == 0);
    }

    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue(6);

        //Insert elements to the queue
        queue.Insert("Red");
        queue.Insert("Blue");
        queue.Insert("Orange");
        queue.Insert("White");
        queue.Insert("Purple");
        queue.Insert("Pink");

        queue.displayQueue();

        //Removing all the elements in the queue and printing them
        while (! queue.isEmpty()) {
            System.out.println(queue.remove());
        }


    }
}
