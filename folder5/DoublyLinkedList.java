// Implementation of Linked List using Sentinel Node
    import java.util.*;
    public class MyDLinkedList <E> implements Iterable<E> {
        private static class DListNode<E> { //Our node
            private E data;
            private DListNode<E> next;
            private DListNode<E> previous;
        }
        private DListNode<E> nil; //Sentinel nil
        private int size;

        public MyDLinkedList() { //Constructor
            nil = new DListNode<E>();
            nil.previous = nil; //aka tail
            nil.next = nil; //aka head
            nil.data = null;
            size = 0;
        }
        private class DListIterator implements Iterator <E> { //Our iterator
            private DListNode <E> pointer;

            public DListIterator() {
                if (nil.next == nil)
                    pointer = nil;
                else
                    pointer = nil.next;
            }
            public E next() {
                E old = pointer.data;
                pointer = pointer.next;
                return old;
            }
            public boolean hasNext() {
                return pointer!=nil;
            }
            public void remove() {
                throw new UnsupportedOperationException();
            }
        }

        public void addFirst(E elem) {  //adds elem to the front of the list
            DListNode <E> newNode = new DListNode<>();
            newNode.data = elem;
            newNode.previous = nil;
            newNode.next = nil.next;

            nil.next.previous= newNode;
            nil.next = newNode;
            size++;
        }
        public void addLast(E elem) {  //adds elem to the end of the list
            DListNode <E> newNode = new DListNode<>();
            newNode.data = elem;
            newNode.previous = nil.previous;
            newNode.next = nil;

            nil.previous.next =newNode;
            nil.previous = newNode;
            size++; //updating size
        }

        public E getFirst() { //Retrieves the first element of the list
            if(nil.previous == nil)
                return null;

            E myNil = (E) nil.next.data;
            return myNil;
        }

        public E getLast(){ //Retrieves the last element in the list
            if(nil.previous == nil)
                return null;

            E myNil = (E) nil.previous.data;
            return myNil;
        }

        public E removeFirst(){ //Removes & returns the front element of the list
            E oldHead = (E) nil.next.data;
            nil.next= nil.next.next;
            nil.next.previous=nil;

            size--; //updating size
            return oldHead;
        }

        public E removeLast() { // Removes & returns the last element of the list
            E oldTail = (E) nil.previous.data;
            nil.previous = nil.previous.previous;
            nil.previous.next = nil;

            size--;
            return oldTail;
        }

        public E get(int index){ //Returns the value at “position” index which exists, else throw exception
            if(index <0 || index >= size)
                throw new IndexOutOfBoundsException();

            int count = 0;
            DListNode temp = nil.next;

            while(count < index) {
                count++;
                temp = temp.next;
            }

            return (E) temp.data;
        }

        public E set(int index, E value){ //Changes the value at “position” index and returns the old value.
            if(index < 0 || index>= size)
                throw new IndexOutOfBoundsException();

            int count = 0;
            DListNode temp = nil.next;

            while(count < index){
                count++;
                temp = temp.next;
            }
            Object old = temp.data;
            temp.data= value;
            return (E) old;
        }

        public boolean contains(Object obj){ //Returns true if obj appears in the list and false otherwise
            return indexOf(obj) != -1;
        }
        public int size(){
            return size;
        }
        public int indexOf(Object obj) { // Returns the index of obj if it is in the list and -1 otherwise.
            int index= 0;
            DListNode<E> myIter = nil.next;

            while(myIter != nil) {
                if(myIter.data.equals(obj))
                    return index;
                index++;
                myIter= myIter.next;
            }
            return -1;
        }
        public Iterator <E> iterator(){ //Returns an iterator over the list.
            return new DListIterator();
        }
    }
