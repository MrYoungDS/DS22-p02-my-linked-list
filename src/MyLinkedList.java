/**
 * The MyLinkedList class is the implementation of a linked list of integers.
 *
 * The list will be made up of doubly-linked nodes of type Node (an inner class) and
 * the basic LinkedList methods addFirst, addLast, add, remove, get, set, and size
 * will be implemented, as well as the additional methods indexOf, clear, and contains.
 *
 * Students should not, obviously, use the LinkedList Java library class. The key to
 * implementing these methods is to not let go, in the sense that any object with no
 * references pointing to it will have its memory reclaimed by the garbage collector.
 * In space, no one can hear you scream.
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

    private Node first;
    private Node last;

    public MyLinkedList()
    {
        // your code here
    }

    /**
     * Appends the specified integer to the end of this list.
     * @param item the integer to add
     */
    public void addLast(int item)
    {
        // your code here
    }

    /**
     * Inserts the specified integer at the beginning of this list.
     * @param item the integer to add
     */
    public void addFirst(int item)
    {
        // your code here
    }

    /**
     * Inserts the specified integer at the specified position in this list.
     * Shifts the element currently at that position (if any) and any subsequent
     * elements to the right (adds one to their indices).
     * @pre index is within bounds, that is 0 <= index <= list.size()
     * @param index index at which the specified integer is to be inserted
     * @param item integer to be inserted
     */
    public void add(int index, int item)
    {
        // your code here
    }

    /**
     * Removes the integer at the specified position in this list. Shifts
     * any subsequent integers to the left (subtracts one from their indices).
     * Returns the integer that was removed from the list.
     * @pre index is within bounds, that is 0 <= index < list.size()
     * @param index the index of the integer to be removed
     * @return the integer previously at the specified position
     */
    public int remove(int index)
    {
        // REPLACE the code here
        return 0;
    }

    /**
     * Returns the integer at the specified position in this list.
     * @pre index is within bounds, that is 0 <= index < list.size()
     * @param index index of the integer to return
     * @return the integer at the specified position in this list
     */
    public int get(int index)
    {
        // REPLACE the code here
        return 0;
    }

    /**
     * Replaces the integer at the specified position in this list with the
     * specified integer.
     * @pre index is within bounds, that is 0 <= index < list.size()
     * @param index index of the integer to replace
     * @param item integer to be stored at the specified position
     * @return the integer previously at the specified position
     */
    public int set(int index, int item)
    {
        // REPLACE the code here
        return 0;
    }

    /**
     * Returns the number of integers in this list.
     * @return the number of integers in this list
     */
    public int size()
    {
        // REPLACE the code here
        return 0;
    }

    /**
     * Returns the index of the first occurrence of the specified integer
     * in this list, or -1 if this list does not contain the integer.
     * @pre index is within bounds, that is 0 <= index < list.size()
     * @param item integer to search for
     * @return the index of the first occurrence of the specified integer
     * in this list, or -1 if this list does not contain the integer
     */
    public int indexOf(int item)
    {
        // REPLACE the code here
        return 0;
    }

    /**
     * Removes all integers from this list. The list will be empty after this
     * call returns.
     */
    public void clear()
    {
        // your code here
    }

    /**
     * Returns true if this list contains the specified integer.
     * @param item integer whose presence in this list is to be tested
     * @return true if this list contains the specified integer
     */
    public boolean contains(int item)
    {
        // REPLACE the code here
        return false;
    }
}
