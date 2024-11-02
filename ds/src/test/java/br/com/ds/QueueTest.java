package br.com.ds;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.ds.queue.Queue;

public class QueueTest {
    private Queue queue;
    
    @BeforeEach
    void setup(){
        queue = new Queue(5);
    }

    @Test
    void testIsEmpty(){
        assertTrue(queue.isEmpty());
        assertTrue(queue.enqueue(555));

        assertFalse(queue.isEmpty());

        assertNotEquals(Queue.NULL_RESULT, queue.dequeue());

        assertTrue(queue.isEmpty());
    }

    @Test
    void testIsFull(){
        assertFalse(queue.isFull());
        assertTrue(queue.enqueue(555));

        assertFalse(queue.isFull());
        assertTrue(queue.enqueue(555));

        assertFalse(queue.isFull());
        assertTrue(queue.enqueue(555));

        assertFalse(queue.isFull());
        assertTrue(queue.enqueue(555));

        assertFalse(queue.isFull());
        assertTrue(queue.enqueue(555));

        assertTrue(queue.isFull());
        
        assertNotEquals(Queue.NULL_RESULT, queue.dequeue());

        assertFalse(queue.isFull());

    }

    @Test
    void testSize(){

        assertEquals(0, queue.getSize());
        assertTrue(queue.enqueue(555));

        assertEquals(1, queue.getSize());
        assertTrue(queue.enqueue(555));

        assertEquals(2, queue.getSize());
        assertTrue(queue.enqueue(555));

        assertEquals(3, queue.getSize());
        assertTrue(queue.enqueue(555));

        assertEquals(4, queue.getSize());
        assertTrue(queue.enqueue(555));

        assertEquals(5, queue.getSize());
        assertFalse(queue.enqueue(555));

        assertEquals(5, queue.getSize());
        
        assertNotEquals(Queue.NULL_RESULT, queue.dequeue());
        assertEquals(4, queue.getSize());

    }

    @Test
    void testPeek(){

        assertTrue(queue.enqueue(1));
        assertTrue(queue.enqueue(2));
        assertTrue(queue.enqueue(3));
        assertTrue(queue.enqueue(4));

        assertEquals("1", queue.peek());
        assertNotEquals(Queue.NULL_RESULT, queue.dequeue());

        assertEquals("2", queue.peek());
        assertNotEquals(Queue.NULL_RESULT, queue.dequeue());

        assertEquals("3", queue.peek());
        assertNotEquals(Queue.NULL_RESULT, queue.dequeue());

        assertEquals("4", queue.peek());
        assertNotEquals(Queue.NULL_RESULT, queue.dequeue());

    }

    @Test
    void testEnqueue(){

        assertTrue(queue.enqueue(1));
        assertTrue(queue.enqueue(2));
        assertTrue(queue.enqueue(3));
        assertTrue(queue.enqueue(4));
        assertTrue(queue.enqueue(5454545));

        assertFalse(queue.enqueue(484848));

        assertEquals("1", queue.peek());


    }

    @Test
    void testDequeue(){

        assertTrue(queue.enqueue(1));
        assertTrue(queue.enqueue(2));
        assertTrue(queue.enqueue(3));
        assertTrue(queue.enqueue(4));
        assertTrue(queue.enqueue(5454545));

        assertFalse(queue.enqueue(484848));

        assertNotEquals(Queue.NULL_RESULT, queue.dequeue());
        assertNotEquals(Queue.NULL_RESULT, queue.dequeue());
        assertNotEquals(Queue.NULL_RESULT, queue.dequeue());
        assertNotEquals(Queue.NULL_RESULT, queue.dequeue());
        assertNotEquals(Queue.NULL_RESULT, queue.dequeue());
        assertEquals(Queue.NULL_RESULT, queue.dequeue());

        assertTrue(queue.enqueue(1));
        assertTrue(queue.enqueue(2));
        assertTrue(queue.enqueue(3));
        assertTrue(queue.enqueue(4));
        assertTrue(queue.enqueue(5454545));

        assertFalse(queue.enqueue(484848));

        assertNotEquals(Queue.NULL_RESULT, queue.dequeue());
        assertNotEquals(Queue.NULL_RESULT, queue.dequeue());
        assertNotEquals(Queue.NULL_RESULT, queue.dequeue());
        assertNotEquals(Queue.NULL_RESULT, queue.dequeue());
        assertNotEquals(Queue.NULL_RESULT, queue.dequeue());
        assertEquals(Queue.NULL_RESULT, queue.dequeue());

    }

    @Test
    void testFindPosition(){

        assertTrue(queue.enqueue(1));
        assertTrue(queue.enqueue(2));
        assertTrue(queue.enqueue(3));
        assertTrue(queue.enqueue(4));
        assertTrue(queue.enqueue(5454545));
        assertFalse(queue.enqueue(484848));

        assertEquals(1, queue.findPosition(1));
        assertEquals(2, queue.findPosition(2));
        assertEquals(3, queue.findPosition(3));
        assertEquals(4, queue.findPosition(4));
        assertEquals(5, queue.findPosition(5454545));
        assertEquals(Queue.NULL_RESULT, queue.findPosition(484848));

        assertNotEquals(Queue.NULL_RESULT, queue.dequeue());
        assertEquals(1, queue.findPosition(2));

        assertNotEquals(Queue.NULL_RESULT, queue.dequeue());
        assertEquals(1, queue.findPosition(3));

        assertNotEquals(Queue.NULL_RESULT, queue.dequeue());
        assertEquals(1, queue.findPosition(4));

        assertNotEquals(Queue.NULL_RESULT, queue.dequeue());
        assertEquals(1, queue.findPosition(5454545));

        assertNotEquals(Queue.NULL_RESULT, queue.dequeue());
        assertEquals(Queue.NULL_RESULT, queue.findPosition(5454545));

    }


}
