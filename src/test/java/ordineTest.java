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
public class ordineTest {
    
    public ordineTest() {
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
     * Test of getNumeroiden method, of class ordine.
     */
    @Test
    public void testGetNumeroiden() {
        System.out.println("getNumeroiden");
        ordine instance= new ordine(1234,"giovanni"); ;
        int expResult = 1234;
        int result = instance.getNumeroiden();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getNomecam method, of class ordine.
     */
    @Test
    public void testGetNomecam() {
        System.out.println("getNomecam");
        ordine instance = new ordine(1234,"giovanni"); 
        String expResult = "giovanni";
        String result = instance.getNomecam();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getPrezzo method, of class ordine.
     */
    @Test
    public void testGetPrezzo() {
        System.out.println("getPrezzo");
        ordine instance = new ordine(1234,"giovanni"); ;
        double expResult = 20.0;
        double result = instance.getPrezzo();
        assertEquals(expResult, result, 20.0);
        // TODO review the generated test code and remove the default call to fail.
    
    }
    /**
     * Test of setNumeroiden method, of class ordine.
     */
    @Test
    public void testSetNumeroiden() {
        System.out.println("setNumeroiden");
        int numeroiden = 1234;
        ordine instance = new ordine(1234,"giovanni"); ;
        instance.setNumeroiden(numeroiden);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of setNomecam method, of class ordine.
     */
    @Test
    public void testSetNomecam() {
        System.out.println("setNomecam");
        String nomecam = "giovanni";
        ordine instance =new ordine(1234,"giovanni"); 
        instance.setNomecam(nomecam);
        // TODO review the generated test code and remove the default call to fail.
  
    }

    /**
     * Test of setPrezzo method, of class ordine.
     */
    @Test
    public void testSetPrezzo() {
        System.out.println("setPrezzo");
        double prezzo = 20.0;
        ordine instance = new ordine(1234,"giovanni"); ;
        instance.setPrezzo(prezzo);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setOrd method, of class ordine.
     */
  

    /**
     * Test of addpatts method, of class ordine.
     */
    @Test
    public void testAddpatts() {
        System.out.println("addpatts");
        piatto i = new piatto("capra arrosto","secondo");
        ordine instance = new ordine(1234,"giovanni");
        instance.addpatts(i);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of removepatts method, of class ordine.
     */
    @Test
    public void testRemovepatts() {
        System.out.println("removepatts");
        piatto i = new piatto("capra arrosto","secondo");
        ordine instance = new ordine(1234,"giovanni");
        instance.removepatts(i);
        // TODO review the generated test code and remove the default call to fail.
     
    }

    /**
     * Test of sommaord method, of class ordine.
     */
    @Test
    public void testSommaord() {
        System.out.println("sommaord");
        ordine instance = new ordine(1234,"giovanni");
        double expResult = 20.0;
        double result = instance.sommaord();
        assertEquals(expResult, result, 20.0);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of confronto method, of class ordine.
     */
    @Test
    public void testConfronto() {
        System.out.println("confronto");
        ordine instance = new ordine(1234,"giovanni");;
        double expResult = 20.0;
        double result = instance.confronto();
        assertEquals(expResult, result, 20.0);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    
}
