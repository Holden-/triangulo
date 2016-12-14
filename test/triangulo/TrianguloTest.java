/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangulo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author NUDES
 */
public class TrianguloTest {
    
    private Triangulo t;
    
    public TrianguloTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        t = new Triangulo();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of verTriangulo method, of class Triangulo.
     */
    @Test
    public void testVerTriangulo() {
        assertEquals(true, t.verTriangulo(5, 6, 7));
        assertEquals(false, t.verTriangulo(0, 0, 34));
    }

    @Test
    public void testVerTipo() {
        assertEquals("equilatero", t.verTipo(5, 5, 5));
        assertEquals("isosceles", t.verTipo(5, 5, 7));
        assertEquals("escaleno", t.verTipo(5, 6, 7));
    }
    
}
