# Data-Structures
Stack , Queue, Link list ,Tree implementations  

Stack Implementation
  - In stack only one element can be taken at a time, the element we added last is removed first.  Stack is follows Last In First Out principle. Elements are removed in
    REVERSED order.
    
    for an example if the stack has elements like give below
    
     | 1 | 2 | 3 | 4 |
       0   1   2   3  <= Index                            stackArray[top] = 4
      
      If we want to remove 0 th index element [1] first we need to remove 3rd index element [D] and 2nd index element [C]. 
      
  - Whenever an element is added (push) top is incremented. And when an element is removed (pop) top value is decremented.
  - The stack is implemented as an array, the array size is taken through the maxSize attribute.
      
      
