
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
        Scanner in=new Scanner(System.in);
        System.out.println("Introduce un número:");
        int numeroProba=in.nextInt();
        if (numeroProba%2==0){
            System.out.println("O número é par");
        }else{
            System.out.println("O número é impar");
        }
    }
}
