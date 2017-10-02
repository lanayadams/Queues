/**
 * List based implementation of a queue
 * @param <t>
 */

public class ListQueue<t> implements Queue<t> {


    DLList<t> list;

    public ListQueue()
    {
        list = new DLList<>();
    }


    /**
     * Adss a new value to the back of the queue.
     * @param value - value to be added.
     */
    public void enqueue(t value)
    {
        list.addToTail(value);
    }


    /**
     * Returns the value from the front of queue and removes it from the queue.
     * @return value removed from front of queue.
     */
    public t dequeue()
    {
        if (isEmpty()) {
            System.out.println("Cannot deueue.  Queue is empty.");
            return null;
        }

        return list.deleteValueAt(0);
    }


    /**
     * Returns the value of the front element of the queue.
     * @return value of the front element of the queue.
     */
    public t front()
    {
        if (isEmpty()) {
            System.out.println("Cannot return front.  Queue is empty.");
            return null;
        }

        return list.getValueAt(0);

    }


    /**
     * @return true if empty.  False otherwise.
     */
    public boolean isEmpty() {
        return list.isEmpty();
    }

}
