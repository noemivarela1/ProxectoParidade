package com.mycompany.proxectoparidade;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.proxectoparidade.ParMain;
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
    }

    /**
     * Test of comprobarParidade method, of class ParMain.
     */
    @Test
    public void testComprobarParidadeCero() {
        System.out.println("comprobarParidade do cero");
        int numeroProba = 0;
        String expResult = "O número é par";
        String resultado = ParMain.comprobarParidade(numeroProba);
        assertEquals(expResult, resultado);
    }
    
    @Test
    public void testComprobarParidadeParPositivo() {
        System.out.println("comprobarParidade do 2");
        int numeroProba = 2;
        String expResult = "O número é par";
        String resultado = ParMain.comprobarParidade(numeroProba);
        assertEquals(expResult, resultado);
    }
    
    @Test
    public void testComprobarParidadeImparPositivo() {
        System.out.println("comprobarParidade do 1");
        int numeroProba = 1;
        String expResult = "O número é impar";
        String resultado = ParMain.comprobarParidade(numeroProba);
        assertEquals(expResult, resultado);
    }
    
    @Test
    public void testComprobarParidadeImparNegativo() {
        System.out.println("comprobarParidade do -1");
        int numeroProba = -1;
        String expResult = "O número é impar";
        String resultado = ParMain.comprobarParidade(numeroProba);
        assertEquals(expResult, resultado);
    }
    
     @Test
    public void testComprobarParidadeParNegativo() {
        System.out.println("comprobarParidade do -2");
        int numeroProba = -2;
        String resultadoEsperado = "O número é par";
        String resultado = ParMain.comprobarParidade(numeroProba);
        assertEquals(resultadoEsperado, resultado);
    }

    /**
     * Test of verificaPar method, of class ParMain.
     */
    @Test
    public void testVerificaParCero() {
        System.out.println("verificaPar de cero");
        int numeroProba = 0;
        assertTrue(ParMain.verificaPar(numeroProba));
    }
    
    @Test
    public void testVerificaParNumPar() {
        System.out.println("verificaPar de 10");
        int numeroProba = 10;
        assertTrue(ParMain.verificaPar(numeroProba));
    }
    
    @Test
    public void testVerificaParNumImpar() {
        System.out.println("verificaPar de 11");
        int numeroProba = 11;
        assertFalse(ParMain.verificaPar(numeroProba));
    }
}
