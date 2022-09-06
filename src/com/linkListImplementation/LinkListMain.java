package com.linkListImplementation;

public class LinkListMain {
    public static void main(String[] args) {

        LinkList newList = new LinkList();

        newList.insert(1);
        newList.insert(2);
        newList.insert(3);
        newList.insert(4);
        newList.insert(5);
      newList.insertMiddle(3,2);
        //newList.delete();
//        newList.deleteMiddle(4);
        newList.displayLinkList();

    }
}
