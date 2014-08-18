/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Desafio01;
import static java.lang.System.in;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Desafio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        final int MAX = 5;
        String nomes[] = new String[MAX];
        char comparacao;
        Scanner scanner = new Scanner(in);
        boolean sinal = false;
        
        for (int i = 0; i < 5; i++) 
        {
            System.out.println("\nDigite nome ");
            nomes[i] = scanner.nextLine();            
        }        
        System.out.println("\nDigite uma letra");
        String letra = scanner.nextLine();
        char letra1 = letra.charAt(0);
        for (int i = 0; i < 5; i++) 
        {
            comparacao = nomes[i].charAt(0);
            if (letra1 == comparacao)
            {
                System.out.println(nomes[i]);
                sinal = true;
            }
        }
        
        if (!sinal) {
            System.out.println("Não encontrado nenhum nome com a letra " + letra);
        }
 
     }
}
