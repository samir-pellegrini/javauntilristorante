/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
public class ordine_tavoloTest {
    
    public ordine_tavoloTest() {
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
     * Test of sommaord method, of class ordine_tavolo.
     */
    @Test
    public void testSommaord() {
        System.out.println("sommaord");
        ordine_tavolo instance =  new ordine_tavolo(1234,"giacomo") ;
        double expResult = 24;
        double result = instance.sommaord();
        assertEquals(expResult, result, 24);
        // TODO review the generated test code and remove the default call to fail.
     
    }
    
}
