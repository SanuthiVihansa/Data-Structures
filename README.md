# Data-Structures
Stack , Queue, Link list ,Tree implementations  

Stack Implementation
  - In stack only one element can be taken at a time, the element we added last is removed first.  Stack follows Last In First Out principle. Elements are removed in
    REVERSED order.
    
    for an example if the stack has elements like give below
    
     | 1 | 2 | 3 | 4 |
     
                             stackArray[top] = 4
      
      If we want to remove 1st index element [2] first we need to remove 3nd index element [4] and  2rd index element [3]. 
      
  - Whenever an element is added (push) top is incremented. And when an element is removed (pop) top value is decremented.
  - The stack is implemented as an array, the array size is taken through the maxSize attribute.
      
      
Queue Implementation

  - First in first out principle is used in the queue. The item which is inserted first is removed first. 
  - Similar to stack the middle values cannot ve accessed directly.
  - contains two variables Rear and Front
  - Insertions are made in the rear end while deletions are made in the front end 
  - Operations of a queue are
      Insert 
      Remove 
      peekFront
      
      
      
