package com.linkListImplementation;

public class Link {
    //The attributes are declared private because we need to build a connection between two classes
    public int iData;
    public Link next; //Declaring a pointer for thr link class

    //Constructor
    public Link(int data) {
        //Initialising the attributes
        this.iData = data; //iData is the data available in the link list
        this.next = null;

    }

    public void displayLink() {
        //printing the iData value
        System.out.println(iData);
    }
}


