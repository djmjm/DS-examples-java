package br.com.ds;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.ds.list.Element;
import br.com.ds.list.List;

public class ListTest{
    List list;

    @BeforeEach
    void setup(){
        list = new List();
    }

    @Test
    void testIsEmpty(){
       assertTrue(list.isEmpty());
       assertTrue(list.pushBack(new Element("null")));
       assertFalse(list.isEmpty());
    }

    @Test
    void testGetSize(){
        assertTrue(list.isEmpty());
        assertTrue(list.pushBack(new Element("null")));
        assertEquals(1, list.getSize());

        assertFalse(list.isEmpty());
        assertTrue(list.pushBack(new Element("null")));
        assertEquals(2, list.getSize());

        assertFalse(list.isEmpty());
        assertTrue(list.pushBack(new Element("null")));
        assertEquals(3, list.getSize());
    }

    @Test
    void testPushBack(){
        assertTrue(list.isEmpty());

        Element elem = new Element("elem");

        assertFalse(list.find(elem));
        assertTrue(list.pushBack(elem));
        assertTrue(list.find(elem));

    }

    @Test
    void testPushFirst(){
        assertTrue(list.isEmpty());

        Element elem = new Element("elem");

        assertFalse(list.find(elem));
        assertTrue(list.pushFirst(elem));
        assertTrue(list.find(elem));

    }

    @Test
    void testRemove(){
        assertTrue(list.isEmpty());

        Element elem = new Element("elem");

        assertFalse(list.find(elem));
        assertTrue(list.pushBack(elem));
        assertTrue(list.find(elem));

        assertTrue(list.remove(elem));
        assertFalse(list.find(elem));

    }
}
