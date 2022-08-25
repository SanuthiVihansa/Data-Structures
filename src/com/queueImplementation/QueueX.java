package com.queueImplementation;

public class QueueX {
    //Declaring the attributes
    private int front;
    private int rear;
    private String [] queueArray; // Queue array
    private int maxSize;
    private int nItems; //Number of items available in the queue
//overloaded constructor
    public QueueX(int size) {
    //Initialise the attributes
        this.maxSize = size;
        this.front = 0;
        this.rear = -1;
        this.queueArray = new String[maxSize];
        this.nItems = 0;
    }

    public void insert(String iData) {
        //check if the array is full
        if (rear == maxSize-1){

            System.out.println("Array is full");

        }
        else {

            queueArray[++rear] = iData;
            nItems++;
        }
    }

    public String remove() {
        //check if the array is empty
        if (nItems == 0) {

            System.out.println("Array is empty");
            return String.valueOf(-99);
        }
        else {

            nItems--;
            return queueArray[front++];

        }

    }

    public Boolean isEmpty() {
        return nItems == 0;
    }

    public Boolean isFull() {
        return (front == maxSize-1);
    }

    public static void main(String[] args) {

        QueueX queue = new QueueX(5);

        //Inserting elements
        queue.insert("A");
        queue.insert("B");
        queue.insert("C");
        queue.insert("D");
        queue.insert("E");

        //Removing elements from the queue

        while(!queue.isEmpty()) {
            System.out.println(queue.remove());
        }

    }

}
