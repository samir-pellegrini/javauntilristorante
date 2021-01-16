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
public class IngredientiTest {
    
    public IngredientiTest() {
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
     * Test of getnomeing method, of class Ingredienti.
     */
    @Test
    public void testGetnomeing() {
        System.out.println("getnomeing");
        Ingredienti instance = new Ingredienti("capra", 1, 20.0);
        String expResult = "capra";
        String result = instance.getnomeing();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getquantita method, of class Ingredienti.
     */
    @Test
    public void testGetquantita() {
        System.out.println("getquantita");
        Ingredienti instance = new Ingredienti("capra", 1, 20.0);
        int expResult = 1;
        int result = instance.getquantita();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getcosto method, of class Ingredienti.
     */
    @Test
    public void testGetcosto() {
        System.out.println("getcosto");
        Ingredienti instance = new Ingredienti("capra", 1, 20.0);
        double expResult = 20.0;
        double result = instance.getcosto();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setnomeing method, of class Ingredienti.
     */
    @Test
    public void testSetnomeing() {
        System.out.println("setnomeing");
        String nomeing = "";
        Ingredienti instance = new Ingredienti("capra", 1, 20.0);
        instance.setnomeing(nomeing);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setquantita method, of class Ingredienti.
     */
    @Test
    public void testSetquantita() {
        System.out.println("setquantita");
        int quantita = 0;
        Ingredienti instance = new Ingredienti("capra", 1, 20.0);
        instance.setquantita(quantita);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setcosto method, of class Ingredienti.
     */
    @Test
    public void testSetcosto() {
        System.out.println("setcosto");
        double costo = 0.0;
        Ingredienti instance = new Ingredienti("capra", 1, 20.0);;
        instance.setcosto(costo);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
