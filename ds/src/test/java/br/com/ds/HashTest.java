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
            assertNotEquals(-1, hash.put(
                new Element("TEST")
            ));
            assertEquals(i+1, hash.getSize());
        }

        assertEquals(-1, hash.put(
            new Element("TEST")
        ));
        assertEquals(10, hash.getSize());
    }
    
}
