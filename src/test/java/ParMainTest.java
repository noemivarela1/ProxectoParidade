/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Disabled;

/**
 *
 * @author Noemí Varela Rodríguez <nvarela at iessanclemente.net>
 */
public class ParMainTest {
    
    public ParMainTest() {
    }

    /**
     * Test of main method, of class ParMain.
     */
    @Test
    @Disabled
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        ParMain.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of comprobarParidade method, of class ParMain.
     */
    @Test
    public void testComprobarParidadeCero() {
        System.out.println("comprobarParidade do cero");
        int numeroProba = 0;
        String expResult = "O número é par";
        String result = ParMain.comprobarParidade(numeroProba);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testComprobarParidadeParPositivo() {
        System.out.println("comprobarParidade do 2");
        int numeroProba = 2;
        String expResult = "O número é par";
        String result = ParMain.comprobarParidade(numeroProba);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testComprobarParidadeImparPositivo() {
        System.out.println("comprobarParidade do 1");
        int numeroProba = 1;
        String expResult = "O número é impar";
        String result = ParMain.comprobarParidade(numeroProba);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testComprobarParidadeImparNegativo() {
        System.out.println("comprobarParidade do -1");
        int numeroProba = -1;
        String expResult = "O número é impar";
        String result = ParMain.comprobarParidade(numeroProba);
        assertEquals(expResult, result);
    }
    
     @Test
    public void testComprobarParidadeParNegativo() {
        System.out.println("comprobarParidade do -2");
        int numeroProba = -2;
        String expResult = "O número é par";
        String result = ParMain.comprobarParidade(numeroProba);
        assertEquals(expResult, result);
    }
}
