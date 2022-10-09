/**
 * The MyLinkedList class is the implementation of a linked list of integers.
 *
 * The list will be made up of doubly-linked nodes of type Node (an inner class) and the
 * basic LinkedList methods add, addFirst, addLast, remove, set, get, and size will be
 * implemented, as well as the additional methods indexOf, clear, and contains.
 *
 * Students should not, obviously, use the LinkedList Java library class. The key to
 * implementing these methods is to not let go, in the sense that any object with no
 * references pointing to it will have its memory reclaimed by the garbage collector.
 *
 * You may add any additional instance fields or private methods as desired.
 */
public class MyLinkedList
{
    /**
     * The Node class is a private inner class of the MyLinkedList class.
     * Since none of the methods of MyLinkedList will return a node, it is safe to make the
     * instance fields here public.
     */
    private class Node
    {
        // these fields default to 0, null, and null
        public int value;
        public Node previous;
        public Node next;
    }


}
