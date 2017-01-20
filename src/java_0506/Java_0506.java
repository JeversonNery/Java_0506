
package java_0506;

import java.util.Scanner;
import java.io.PrintStream;


/**
 *
 * @author Jeverson Nery
 */
public class Java_0506 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        PrintStream saida = System.out;
        
        System.out.printf("Informe seu nome e sobrenome: ");
        String nome = scan.nextLine();
        
        char part_one = nome.charAt(0);
        String part = nome.substring(nome.indexOf(" ") + 1);
        char part_two = part.charAt(0);
        
        saida.println("Iniciais de nome e sobrenome:\t" + part_one + part_two);

    }
    
}
