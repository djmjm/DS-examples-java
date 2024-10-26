package br.com.ds;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.ds.stack.Stack;

public class StackTest {
    private Stack stack;

    @BeforeEach
    void setup(){
        stack = new Stack(5);
    }

    @Test
    void testIsEmpty(){
        assertTrue(stack.isEmpty());
    }

    @Test
    void testPush(){
        assertTrue(stack.push( (int) Math.random() ));
        assertFalse(stack.isEmpty());
        assertFalse(stack.isFull());
    }

    @Test
    void testPop(){
        assertTrue(stack.push( (int) Math.random() ));
        assertTrue(stack.push( (int) Math.random() ));
        assertTrue(stack.push( (int) Math.random() ));
        assertFalse(stack.isEmpty());
        assertFalse(stack.isFull());

        assertTrue(stack.pop());
        assertTrue(stack.pop());
        assertTrue(stack.pop());

        assertTrue(stack.isEmpty());
        assertFalse(stack.isFull());
    }

    @Test
    void testFull(){
        assertTrue(stack.push( (int) Math.random() ));
        assertFalse(stack.isFull());

        assertTrue(stack.push( (int) Math.random() ));
        assertFalse(stack.isFull());

        assertTrue(stack.push( (int) Math.random() ));
        assertFalse(stack.isFull());

        assertTrue(stack.push( (int) Math.random() ));
        assertFalse(stack.isFull());

        assertTrue(stack.push( (int) Math.random() ));
        assertTrue(stack.isFull());

        assertFalse(stack.push( (int) Math.random() ));
        assertTrue(stack.isFull());
       
    }

    @Test
    void testReturnValue(){
        assertTrue(stack.push( 1));
        assertTrue(stack.push( 2 ));
        assertTrue(stack.push( 3 ));

        assertTrue(stack.pop());
        assertEquals(3, stack.getValueTop());

        assertTrue(stack.pop());
        assertEquals(2, stack.getValueTop());

        assertTrue(stack.pop());
        assertEquals(1, stack.getValueTop());

        assertFalse(stack.pop());
        assertTrue(stack.isEmpty());
       
    }

}
