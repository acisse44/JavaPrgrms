Write a program that works identical to Doubly linked lists, but instead of maintaining head and tail references 
such that head.previous = null and tail.next = null, they maintain a reference to one special node called
“the sentinel node” or “nil.” This node replaces the null references so that a NullPointerException 
can never be thrown. The sentinel node has the following properties:
 sentinel.previous = what we used to call the tail
 sentinel.next = what we used to call the head
 what we used to call the tail.next = sentinel
 what we used to call the head.previous = sentinel 
 
 Implement the operations of the Java Linked List
