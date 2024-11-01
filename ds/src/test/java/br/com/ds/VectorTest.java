package br.com.ds;

import org.junit.jupiter.api.BeforeEach;

import br.com.ds.stack.Stack;
import br.com.ds.vector.Vector;

public class VectorTest {

    private Vector vector;

     @BeforeEach
    void setup(){
        vector = new Vector(10);
    };
}
