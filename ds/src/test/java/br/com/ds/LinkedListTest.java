package br.com.ds;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.ds.list.Element;
import br.com.ds.list.LinkedList;


public class LinkedListTest {
    private LinkedList list;
    
    @BeforeEach
    void setup(){
        list = new LinkedList();
    }

    @Test
    void testIsEmpty(){
        assertTrue(list.isEmpty());

        assertTrue(list.push(new Element("TEST")));
        assertFalse(list.isEmpty());

        list.pop();

        assertTrue(list.isEmpty());
    }

    @Test
    void testPush(){
        assertTrue(list.isEmpty());

        assertTrue(list.push(new Element("TEST")));
        assertTrue(list.push(new Element("Hello")));
        assertTrue(list.push(new Element("world")));
        assertTrue(list.push(new Element("junit")));
        
        assertEquals(list.pop().getName(), "junit");
        assertEquals(list.pop().getName(), "world");
        assertEquals(list.pop().getName(), "Hello");
        assertEquals(list.pop().getName(), "TEST");


        assertTrue(list.isEmpty());
    }

    @Test
    void popTest(){
        assertTrue(list.isEmpty());

        String str1 = "HELLO";
        String str2 = "lorem";
        String str3 = "ipsum";
        String str4 = "latim";

        assertTrue(list.push(new Element(str1)));
        assertTrue(list.push(new Element(str2)));
        assertTrue(list.push(new Element(str3)));
        assertTrue(list.push(new Element(str4)));
        
        assertEquals(list.pop().getName(), str4);
        assertFalse(list.isEmpty());

        assertEquals(list.pop().getName(), str3);
        assertFalse(list.isEmpty());

        assertEquals(list.pop().getName(), str2);
        assertFalse(list.isEmpty());

        assertEquals(list.pop().getName(), str1);
        assertTrue(list.isEmpty());
    }

    @Test
    void getFirstTest(){
        assertTrue(list.isEmpty());

        String str1 = "HELLO";
        String str2 = "lorem";
        String str3 = "ipsum";

        assertTrue(list.push(new Element(str1)));
        assertEquals(str1, list.getFirst().getName());

        assertTrue(list.push(new Element(str2)));
        assertEquals(str2, list.getFirst().getName());

        assertTrue(list.push(new Element(str3)));
        assertEquals(str3, list.getFirst().getName());

        list.pop();

        assertEquals(str2, list.getFirst().getName()); list.pop();
        assertEquals(str1, list.getFirst().getName());
        
    }

    @Test
    void getLastTest(){
        assertTrue(list.isEmpty());

        String str1 = "HELLO";
        String str2 = "lorem";
        String str3 = "ipsum";

        assertTrue(list.push(new Element(str1)));
        assertEquals(str1, list.getLast().getName());

        assertTrue(list.push(new Element(str2)));
        assertEquals(str1, list.getLast().getName());

        assertTrue(list.push(new Element(str3)));
        assertEquals(str1, list.getLast().getName());

        list.pop();

        assertEquals(str1, list.getLast().getName()); list.pop();
        assertEquals(str1, list.getLast().getName());
        


    }
    @Test
    void findTest(){
        assertTrue(list.isEmpty());

        String strTrue = "true";
        Element elementTrue = new Element(strTrue);

        assertTrue(list.push( new Element("test")  ));
        assertTrue(list.push( elementTrue  ));

        assertEquals(
            elementTrue
            , 
            list.find( elementTrue.getId() )
            );


    }

    
}
