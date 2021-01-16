/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Vector;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author samir pellegrini
 */
public class ristoranteTest {
    
    public ristoranteTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getpiatti method, of class ristorante.
     */
    @Test
    public void testGetpiatti() {
        System.out.println("getpiatti");
        ristorante instance = new ristorante();
        Vector<piatto> expResult = null;
        Vector<piatto> result = instance.getpiatti();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getordine method, of class ristorante.
     */
    @Test
    public void testGetordine() {
        System.out.println("getordine");
        ristorante instance = new ristorante();
        Vector<ordine> expResult = null;
        Vector<ordine> result = instance.getordine();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setpiatti method, of class ristorante.
     */
    @Test
    public void testSetpiatti() {
        System.out.println("setpiatti");
        Vector<piatto> piatti = null;
        ristorante instance = new ristorante();
        instance.setpiatti(piatti);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of setordine method, of class ristorante.
     */
    @Test
    public void testSetordine() {
        System.out.println("setordine");
        Vector<ordine> ordine = null;
        ristorante instance = new ristorante();
        instance.setordine(ordine);
        // TODO review the generated test code and remove the default call to fail.
    
    }

    /**
     * Test of addpatt method, of class ristorante.
     */
    @Test
    public void testAddpatt() {
        System.out.println("addpatt");
        piatto i = null;
        ristorante instance = new ristorante();
        instance.addpatt(i);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of removepatt method, of class ristorante.
     */
    @Test
    public void testRemovepatt() {
        System.out.println("removepatt");
        piatto i = null;
        ristorante instance = new ristorante();
        instance.removepatt(i);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of sommagio method, of class ristorante.
     */
    @Test
    public void testSommagio() {
        System.out.println("sommagio");
        ristorante instance = new ristorante();
        double expResult = 0.0;
        double result = instance.sommagio();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
      
    }
    
}
