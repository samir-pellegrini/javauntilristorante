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
public class piattoTest {
    
    public piattoTest() {
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
     * Test of addingre method, of class piatto.
     */
    @Test
    public void testAddingre() {
        System.out.println("addingre");
        Ingredienti i = new Ingredienti("capra", 1, 20.0);
        piatto instance = new piatto("capra arrosto","secondo");;
        instance.addingre(i);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of removeingre method, of class piatto.
     */
    @Test
    public void testRemoveingre() {
        System.out.println("removeingre");
        int i = 0;
        piatto instance = new piatto("capra arrosto","secondo");;
        instance.removeingre(i);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of sommmaing method, of class piatto.
     */
    @Test
    public void testSommmaing() {
        System.out.println("sommmaing");
        piatto instance = new piatto("capra arrosto","secondo");
        double expResult = 20.0;
        double result = instance.sommmaing();
        assertEquals(expResult, result, 20.0);
        // TODO review the generated test code and remove the default call to fail.
     
    }
    
}
