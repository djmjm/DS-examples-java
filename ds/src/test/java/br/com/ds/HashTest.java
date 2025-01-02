package br.com.ds;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.ds.hash.Hash;
import br.com.ds.list.Element;

public class HashTest {

    private Hash hash;

    @BeforeEach
    void setup(){
        hash = new Hash(10);
    }

    @Test
    void testPut(){
        assertEquals(0, hash.getSize());

        for(int i = 0; i < hash.getMaxSize(); i++){
            assertNotEquals(false, hash.put(
                new Element("TEST")
            ));
            assertEquals(i+1, hash.getSize());
        }

        assertEquals(false, hash.put(
            new Element("TEST")
        ));
        assertEquals(10, hash.getSize());
    }

    @Test
    void testFind(){
        assertEquals(0, hash.getSize());

        Element one = new Element("one");
        Element two = new Element("two");

        assertTrue(hash.put(one));

        assertTrue(hash.find(one));
        assertFalse(hash.find(two));

        assertEquals(1, hash.getSize());
    }

    @Test
    void testRemove(){
        assertEquals(0, hash.getSize());

        Element one = new Element("one");
        Element two = new Element("two");

        assertTrue(hash.put(one));
        assertTrue(hash.put(two));

        assertTrue(hash.find(one));
        assertTrue(hash.find(two));

        assertEquals(2, hash.getSize());

        assertTrue(hash.remove(two));
        assertFalse(hash.find(two));

        assertEquals(1, hash.getSize());

        assertTrue(hash.remove(one));
        assertFalse(hash.find(one));

        assertEquals(0, hash.getSize());
    }

    @Test
    void testGet(){
        assertEquals(0, hash.getSize());

        Element elem = new Element("ONE");

        for(int i = 0; i < hash.getMaxSize(); i++){
            hash.put(elem);
        }

        for(int i = 0; i < hash.getMaxSize(); i++){
            assertEquals(elem.getId(), hash.get(i).getId());
        }

    }
    
}
