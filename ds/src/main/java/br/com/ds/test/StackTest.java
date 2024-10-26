package br.com.ds.test;


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

}

