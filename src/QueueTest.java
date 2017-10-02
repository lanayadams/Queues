/**
 * A simple class to test my queue.
 */

public class QueueTest {


    public void testQueue(Queue<String> q, String identifier) {

        System.out.println("===============start===============");
        enqueueTest(q, identifier);
        dequeueTest(q);
        combinedTest(q,identifier+"2");
        System.out.println("===============end===============");


    }


    /**
     * Enqueues a bunch of stuff.  Prints error if full.
     * @param q - queue to test
     * @param appendStr - test string.
     */
    public void enqueueTest(Queue<String> q, String appendStr)
    {
        for (int i=0; i<20; i++) {
            q.enqueue(appendStr + "" + i);
        }
    }


    /**
     * Dequeues everything in queue.  Prints error message if you go out of bounds.
     * @param q - queue under test.
     */
    public void dequeueTest(Queue<String> q)
    {
        String value;
        for (int i=0; i<20; i++) {
            value = q.dequeue();
            System.out.println("Dequeue Value = " + value);
        }
    }

    /**
     * Checks that everything is working by enqueuing and dequeuing in rapid succession
     * @param q - queue to test
     * @param appendStr - string to append for test case.
     */
    public void combinedTest(Queue<String> q, String appendStr)
    {
        for (int i=0; i<20; i++) {
            q.enqueue(appendStr + "" + i);
            System.out.println("Front Value = " + q.front());
            System.out.println("Dequeue Value = " + q.dequeue());
        }
    }



    public static void main(String [] args) {


        QueueTest qt = new QueueTest();
        qt.testQueue(new ArrayQueue<String>(10), "ArrQ");
        qt.testQueue(new ListQueue<String>() , "LisQ");



    }

}
