package com.mycompany.proxectoparidade;


import java.util.Scanner;


/**
 * Comproba a paridade dun número enteiro
 * @author Noemí Varela Rodríguez <nvarela at iessanclemente.net>
 * @date 22 feb 2022
 */
public class ParMain {
    private static final String O_NUMERO_E_IMPAR = "O número é impar";
    private static final String O_NUMERO_E_PAR = "O número é par";
    /**
     * le un número da entrada estándar e comproba a súa paridade
     * @param args argumentos da liña de comandos
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int numeroProba=lerNumero(entrada);
        System.out.println(comprobarParidade(numeroProba));
    }

    /**
     * Indica se numeroProba é par ou impar
     * @param numeroProba número enteiro a comprobar
     * @return cadea indicando a paridade
     */
    static String comprobarParidade(int numeroProba) {
        String resultado;
        if (verificaPar(numeroProba)){
            resultado=O_NUMERO_E_PAR;
        }else{
            resultado=O_NUMERO_E_IMPAR;
        }
        return resultado;
    }

    /**
     * Verifica se numeroProba é par
     * @param numeroProba número enteiro a comprobar
     * @return booleano con valor true se o número é par
     */
    static boolean verificaPar(int numeroProba) {
        return numeroProba%2==0;
    }
    
    /**
     * Le número da entrada estándar
     * @param in representa a entrada estándar
     * @return enteiro inserido polo usuario
     */
    private static int lerNumero(Scanner in) {
        System.out.println("Introduce un número:");
        int numeroProba=in.nextInt();
        return numeroProba;
    }
}
