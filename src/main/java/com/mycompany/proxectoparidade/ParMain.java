package com.mycompany.proxectoparidade;


import java.util.Scanner;


/**
 *
 * @author Noemí Varela Rodríguez <nvarela at iessanclemente.net>
 * @date 22 feb 2022
 */
public class ParMain {

    /**
     * @param args argumentos da liña de comandos
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int numeroProba=lerNumero(entrada);
        System.out.println(comprobarParidade(numeroProba));
    }

    static String comprobarParidade(int numeroProba) {
        String resultado;
        if (verificaPar(numeroProba)){
            resultado=O_NUMERO_E_PAR;
        }else{
            resultado=O_NUMERO_E_IMPAR;
        }
        return resultado;
    }

    static boolean verificaPar(int numeroProba) {
        return numeroProba%2==0;
    }
    private static final String O_NUMERO_E_IMPAR = "O número é impar";
    private static final String O_NUMERO_E_PAR = "O número é par";

    private static int lerNumero(Scanner in) {
        System.out.println("Introduce un número:");
        int numeroProba=in.nextInt();
        return numeroProba;
    }
}
