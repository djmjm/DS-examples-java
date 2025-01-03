package br.com.ds;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.LinkedList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.ds.hash.Hash;
import br.com.ds.hash.HashChain;
import br.com.ds.list.Element;

public class HashTest {

    private Hash hash;
    private HashChain hashChain;

    @BeforeEach
    void setup(){
        hash = new Hash(10);
        hashChain = new HashChain(10);
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
    void testPutChain(){
        assertEquals(0, hashChain.getSize());
        Element elem = new Element("TEST");

        for(int i = 0; i < hashChain.getMaxSize(); i++){
            assertNotEquals(false, hashChain.put(
                elem
            ));
            assertEquals(i+1, hashChain.getSize());
        }

        int numberElemFirstChain = 0;
        int indexSelected = 0;

        for(int i = 0; i < hashChain.getMaxSize(); i++){
            if(hashChain.get(i) != null){
                numberElemFirstChain++;
                indexSelected = i;
            }
        }
        assertEquals(1, numberElemFirstChain);
        LinkedList<Element> elements = hashChain.get(indexSelected);
        
        for(Element item: elements){
            assertEquals(elem, item);
        }

        assertEquals(10, hashChain.getSize());


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
    void testFindChain(){
        assertEquals(0, hashChain.getSize());

        Element one = new Element("one");
        Element two = new Element("two");

        assertTrue(hashChain.put(one));

        assertTrue(hashChain.find(one));
        assertFalse(hashChain.find(two));

        assertEquals(1, hashChain.getSize());
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
    void testRemoveChain(){
        assertEquals(0, hashChain.getSize());

        Element one = new Element("one");
        Element two = new Element("two");

        assertTrue(hashChain.put(one));
        assertTrue(hashChain.put(two));

        assertTrue(hashChain.find(one));
        assertTrue(hashChain.find(two));

        assertEquals(2, hashChain.getSize());

        assertTrue(hashChain.remove(two));
        assertFalse(hashChain.find(two));

        assertEquals(1, hashChain.getSize());

        assertTrue(hashChain.remove(one));
        assertFalse(hashChain.find(one));

        assertEquals(0, hashChain.getSize());
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
