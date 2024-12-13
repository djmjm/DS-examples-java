package br.com.ds;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.ds.list.DoublyLinkedList;
import br.com.ds.list.Element;
import br.com.ds.list.ElementBack;
import br.com.ds.list.LinkedList;


public class LinkedListTest {
    private LinkedList list;
    private DoublyLinkedList doublyList;
    
    @BeforeEach
    void setup(){
        list = new LinkedList();
        doublyList = new DoublyLinkedList();
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

    @Test
    void insertTest(){
        assertTrue(list.isEmpty());

        String strInsert = "insertTwo";
        Element elementInsert = new Element(strInsert);

        assertTrue(list.push(new Element("Hello World")));
        assertTrue(list.push(new Element("Final World")));
        assertTrue(list.insert(elementInsert, 2));

        assertEquals(3, list.getSize());

        assertEquals("Hello World", list.getLast().getName());
        assertEquals("Final World", list.getFirst().getName());
        assertEquals("insertTwo", list.find(elementInsert.getId()).getName());


    }

    @Test
    void removeTest(){
        assertTrue(list.isEmpty());

        String strInsert = "insertTwo";
        Element elementInsert = new Element(strInsert);

        assertTrue(list.push(new Element("Start")));
        assertTrue(list.push(new Element("Final World")));
        assertTrue(list.insert(elementInsert, 2));

        assertEquals(3, list.getSize());

        assertEquals("Start", list.getLast().getName());
        assertEquals("Final World", list.getFirst().getName());
        assertEquals("insertTwo", list.find(elementInsert.getId()).getName());

        assertTrue(list.remove(2));

        assertEquals(null, list.find(elementInsert.getId()));
    }

    @Test
    void pushFirstBack(){
        assertTrue(doublyList.isEmpty());

        String strInsertBack = "back";
        ElementBack elementInsertBack = new ElementBack(strInsertBack);
        String strInsertFirst = "first";
        ElementBack elementInsertFirst = new ElementBack(strInsertFirst);

        assertEquals(true, doublyList.pushBack(elementInsertBack));
        assertEquals(1, doublyList.getSize());

        assertEquals(true, doublyList.pushFirst(elementInsertFirst));
        assertEquals(2, doublyList.getSize());

        assertEquals(strInsertBack, doublyList.getEnd().getName());
        assertEquals(strInsertFirst, doublyList.getFirst().getName());

    }

    @Test
    void removeFirst(){
        assertTrue(doublyList.isEmpty());

        String strOne = "One";
        ElementBack elementOne = new ElementBack(strOne);

        String strTwo = "Two";
        ElementBack elementTwo = new ElementBack(strTwo);

        String strThree = "Three";
        ElementBack elementThree = new ElementBack(strThree);

        doublyList.pushBack(elementOne);
        doublyList.pushBack(elementTwo);
        doublyList.pushBack(elementThree);

        assertEquals(strOne, doublyList.getFirst().getName());
        assertEquals(strThree, doublyList.getEnd().getName());

        assertTrue(doublyList.removeFirst());

        assertEquals(strTwo, doublyList.getFirst().getName());
        assertEquals(strThree, doublyList.getEnd().getName());

        assertTrue(doublyList.removeFirst());

        assertEquals(strThree, doublyList.getFirst().getName());
        assertEquals(strThree, doublyList.getEnd().getName());

        assertTrue(doublyList.removeFirst());

        assertEquals(null, doublyList.getFirst());
        assertEquals(null, doublyList.getEnd());

        assertFalse(doublyList.removeFirst());
    }

    @Test
    void removeBack(){
        assertTrue(doublyList.isEmpty());

        String strOne = "One";
        ElementBack elementOne = new ElementBack(strOne);

        String strTwo = "Two";
        ElementBack elementTwo = new ElementBack(strTwo);

        String strThree = "Three";
        ElementBack elementThree = new ElementBack(strThree);

        doublyList.pushBack(elementOne);
        doublyList.pushBack(elementTwo);
        doublyList.pushBack(elementThree);

        assertEquals(strOne, doublyList.getFirst().getName());
        assertEquals(strThree, doublyList.getEnd().getName());

        assertTrue(doublyList.removeBack());

        assertEquals(strOne, doublyList.getFirst().getName());
        assertEquals(strTwo, doublyList.getEnd().getName());

        assertTrue(doublyList.removeBack());

        assertEquals(strOne, doublyList.getFirst().getName());
        assertEquals(strOne, doublyList.getEnd().getName());

        assertTrue(doublyList.removeBack());

        assertEquals(null, doublyList.getFirst());
        assertEquals(null, doublyList.getEnd());

        assertFalse(doublyList.removeBack());
    }

    @Test
    void findDoubly(){
        assertTrue(doublyList.isEmpty());

        String str1 = "one";
        String str2 = "two";

        ElementBack elem1 = new ElementBack(str1);
        ElementBack elem2 = new ElementBack(str2);

        assertTrue(doublyList.pushFirst(elem1));
        assertTrue(doublyList.pushBack(elem2));

        assertTrue(doublyList.find(elem1.getId()));
        assertTrue(doublyList.find(elem2.getId()));

        assertTrue(doublyList.removeFirst());

        assertFalse(doublyList.find(elem1.getId()));
        assertTrue(doublyList.find(elem2.getId()));

        assertTrue(doublyList.removeFirst());

        assertFalse(doublyList.find(elem1.getId()));
        assertFalse(doublyList.find(elem2.getId()));

        assertTrue(doublyList.isEmpty());
    }

    
}
