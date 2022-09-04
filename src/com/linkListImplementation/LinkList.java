package com.linkListImplementation;

public class LinkList {

    //To link multiple links linkList class is used

    private Link first ;

    //Constructor
    public  LinkList() {
        //Initialising the attributes
        first = null;
    }

    public void displayLinkList() {

        Link current = first ; //declaring a link type pointer and assigning first to it

        //Until the current value not equal to null the while loop iterates
        while(current!=null) {

            current.displayLink(); //calling the displayLink method in the link class
            current = current.next; //incrementing the correct (moving the current to the next link)

        }
    }

    public boolean find(int data) {
        Link current = first;

        while (current != null) {
            if(current.iData==data){
                return true;
            }
        }
        return false;
    }

    //Insert as the first link
    public void insert(int data) {

        Link newData = new Link(data);

        newData.next=first;
        first= newData;

    }

    public void insertMiddle(int key, int data) {

        Link newData =  new Link(data);
        Link current = first;

        while (current != null) {

            if (current.iData == key) {

                newData.next=current.next;
                current.next = newData;

            }
            else {
                current =  current.next;
            }

        }

    }

    //Delete as the first link
    public Link delete() {

        Link temp = first;
        first = first.next;
        return temp;
    }

    public boolean deleteMiddle(int key){
        Link previous = first;
        Link current = first;
        while(current != null) {
            if (current == first) {
                first = first.next;
                return true;
            }
            else if(current.iData == key) {
                previous.next=first.next;
                return true;
            }
            else {
                current = current.next;
            }
        }
        return false;
    }

}
