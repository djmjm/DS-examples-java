package br.com.ds;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.ds.deque.Deque;

public class DequeTest {
    private Deque deque;
    
    @BeforeEach
    void setup(){
        deque = new Deque(5);
    }

    @Test
    void testDequeuLast(){
        assertTrue(deque.enqueueFirst(1));

        assertTrue(deque.enqueueFirst(2));

        assertTrue(deque.enqueueFirst(3));

        assertTrue(deque.enqueueFirst(4));

        assertTrue(deque.enqueueFirst(5));

        assertFalse(deque.enqueueFirst(55));

        assertEquals(1 , deque.dequeueLast());

        assertTrue(deque.enqueueFirst(111111));

        assertEquals( "111111" , deque.peek());

        assertEquals(2 , deque.dequeueLast());
        assertEquals( "3" , deque.peekLast());

        assertEquals(3 , deque.dequeueLast());
        assertEquals( "4" , deque.peekLast());

        assertEquals(4 , deque.dequeueLast());
        assertEquals( "5" , deque.peekLast());

        assertEquals(5 , deque.dequeueLast());
        assertEquals( "111111" , deque.peekLast());

        assertEquals(111111 , deque.dequeueLast());

        assertTrue(deque.isEmpty());
    }


    @Test
    void testEnqueueFirst(){
        assertTrue(deque.enqueueFirst(1));

        assertTrue(deque.enqueueFirst(2));

        assertTrue(deque.enqueueFirst(3));

        assertTrue(deque.enqueueFirst(4));

        assertTrue(deque.enqueueFirst(5));

        assertFalse(deque.enqueueFirst(55));

        assertEquals(1 , deque.dequeueLast());

        assertTrue(deque.enqueueFirst(111111));

        assertEquals( "111111" , deque.peek());

        
    }

    @Test
    void testPeekLast(){
        assertTrue(deque.enqueueFirst(1));
        assertEquals( "1" , deque.peekLast());

        assertTrue(deque.enqueueFirst(2));
        assertEquals( "2" , deque.peek());
        assertEquals( "1" , deque.peekLast());

        assertTrue(deque.enqueueFirst(3));
        assertEquals( "3" , deque.peek());
        assertEquals( "1" , deque.peekLast());

        assertTrue(deque.enqueueFirst(4));
        assertEquals( "4", deque.peek());
        assertEquals( "1" , deque.peekLast());

        assertTrue(deque.enqueueFirst(5));
        assertEquals( "5", deque.peek());
        assertEquals( "1" , deque.peekLast());

        assertFalse(deque.enqueueFirst(55));
        assertEquals( "5", deque.peek());
        assertEquals( "1" , deque.peekLast());

    }


}
