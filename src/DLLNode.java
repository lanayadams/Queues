/**
 * @author Richard S. Stansbury
 * @version 1.0, 2017-09-21
 *
 * Implementation of a doubly linked list node.
 */
public class DLLNode<t> {


    //Class Variables
    public t info;
    public DLLNode<t> next;
    public DLLNode<t> prev;

    /**
     * Constructor for case where next node does not exist or is unknown.
     * @param info - info to be stored in node of type t.
     */
    public DLLNode(t info) {
        this.info = info;
        this.next = null;
        this.prev = null;
    }

    /**
     * Constructor for case where next node exists and is known.
     * @param info - info to be stored in the node of type t
     * @param prev - reference to the previous node in the list
     * @param next - reference to the next node in the list
     */
    public DLLNode(t info, DLLNode<t> prev, DLLNode<t> next ) {
        this.info = info;
        this.prev = prev;
        this.next = next;
    }

    /**
     * @return a string generated by calling toString on the info stored within the node
     */
    public String toString() {
        return info.toString();
    }

}