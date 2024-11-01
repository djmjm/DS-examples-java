package br.com.ds;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.ds.vector.Vector;

public class VectorTest {

    private Vector vector;

     @BeforeEach
    void setup(){
        vector = new Vector(5);
    };

    @Test
    void testIsEmpty(){
        assertTrue(vector.isEmpty());
        assertTrue(vector.push(10));
        assertFalse(vector.isEmpty());

        assertTrue(vector.remove(0));
        assertTrue(vector.isEmpty());
    }

    @Test
    void testIsFull(){
        assertFalse(vector.isFull());
        assertTrue(vector.push(1));

        assertFalse(vector.isFull());
        assertTrue(vector.push(2));

        assertFalse(vector.isFull());
        assertTrue(vector.push(3));

        assertFalse(vector.isFull());
        assertTrue(vector.push(4));

        assertFalse(vector.isFull());
        assertTrue(vector.push(5));

        assertTrue(vector.isFull());

        assertTrue(vector.remove(0));
        assertFalse(vector.isFull());
    }

    @Test
    void testSize(){
        assertEquals(0, vector.getSize());
        assertTrue(vector.push(99));

        assertEquals(1, vector.getSize());
        assertTrue(vector.push(99));

        assertEquals(2, vector.getSize());
        assertTrue(vector.push(99));

        assertEquals(3, vector.getSize());
        assertTrue(vector.push(99));

        assertEquals(4, vector.getSize());
        assertTrue(vector.push(99));

        assertEquals(5, vector.getSize());

        assertFalse(vector.push(99));
        assertFalse(vector.push(99));
        assertFalse(vector.push(99));
        assertFalse(vector.push(99));
        assertFalse(vector.push(99));

        assertEquals(5, vector.getSize());

        assertTrue(vector.remove(2));

        assertEquals(4, vector.getSize());

    }

    @Test
    void testRemove(){
        
        assertTrue(vector.push(1));
        assertTrue(vector.push(2));
        assertTrue(vector.push(3));
        assertTrue(vector.push(4));
        assertTrue(vector.push(5));

        assertTrue(vector.remove(0));
        assertFalse(vector.contains(1));

        assertTrue(vector.remove(0));
        assertFalse(vector.contains(2));

        assertTrue(vector.remove(0));
        assertFalse(vector.contains(3));

        assertTrue(vector.remove(0));
        assertFalse(vector.contains(4));

        assertTrue(vector.remove(0));
        assertFalse(vector.contains(5));

        assertFalse(vector.remove(0));
        assertEquals(0, vector.getSize());

    }

    @Test
    void testRemoveValueAll(){
        
        assertTrue(vector.push(1));
        assertTrue(vector.push(3));
        assertTrue(vector.push(1));
        assertTrue(vector.push(2));
        assertTrue(vector.push(1));

        assertTrue(vector.removeValueAll(1));
       
        assertFalse(vector.contains(1));
        assertTrue(vector.contains(2));
        assertTrue(vector.contains(3));
        assertEquals(2, vector.getSize());

    }

    @Test
    void testReplace(){
        
        assertTrue(vector.push(1));
        assertTrue(vector.push(3));
        assertTrue(vector.push(1));
        assertTrue(vector.push(2));
        assertTrue(vector.push(1));

        assertTrue(vector.replace(33, 1));
        assertTrue(vector.replace(22, 3));

        assertTrue(vector.contains(33));
        assertFalse(vector.contains(3));

        assertTrue(vector.contains(22));
        assertFalse(vector.contains(2));


    }

    @Test
    void testInsert(){
        
        assertTrue(vector.push(1));
        assertTrue(vector.push(3));
        assertTrue(vector.push(1));
        assertTrue(vector.push(2));

        assertEquals(1, vector.findValue(2));
        
        assertTrue(vector.insert(11, 2));
        assertEquals(11, vector.findValue(2));
        assertEquals(1, vector.findValue(3));
        assertEquals(2, vector.findValue(4));

        assertEquals(5, vector.getSize());


    }


}
