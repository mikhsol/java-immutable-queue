# Java implementation of immutable queue

Queue implemented as single linked list, has &Theta;(C) enqueue and dequeue time 
complexity.

Immutable queue implement has next interface:
 
```java
public interface Queue<T> {
    Queue<T> enQueue(T t);
    //Removes the element at the beginning of the immutable queue, 
    // and returns the new queue.
    Queue<T> deQueue();
    T head();
    boolean isEmpty();
}
```
