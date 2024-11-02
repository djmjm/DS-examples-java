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


}
