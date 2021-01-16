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
public class ordine_domicilioTest {
    
    public ordine_domicilioTest() {
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
     * Test of sommaord method, of class ordine_domicilio.
     */
    @Test
    public void testSommaord() {
        System.out.println("sommaord");
        ordine_domicilio instance = new ordine_domicilio(1226,"angelo",21,"via di brozzi");
        double expResult = 34;
        double result = instance.sommaord();
        assertEquals(expResult, result, 34);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    
}
