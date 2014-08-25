/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e2;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class Exercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        {
            int maxSize = 5;             // comentario aqui
            EstruturaDados estruturaDados;            // comentario aqui
            estruturaDados = new EstruturaDados(maxSize);  // comentario aqui
            // comentario aqui
            estruturaDados.insert("Jonatas", "Desenvolvedor", 22);
            estruturaDados.insert("Alexandre", "Professor", 34);
            estruturaDados.insert("Peter", "DBA", 44);
            estruturaDados.insert("Jabes", "Concultor", 55);
            estruturaDados.insert("Alarick", "Analisa de Sistemas", 38);

            estruturaDados.display();                // comentario aqui

            String searchKey = JOptionPane.showInputDialog(null, "Digite o nome que deseja deletar");  // comentario aqui
            Pessoa found;
            found = estruturaDados.find(searchKey);
            if (found != null) {
                System.out.print("Encontrado");
                found.displayPessoa();
            } else {
                System.out.println("Não encontrado " + searchKey);
            }

            String deletar = JOptionPane.showInputDialog(null, "Digite um nome para deletar");
            estruturaDados.delete(deletar);          // comentario aqui

            estruturaDados.display();// comentario aqui
        }  // end main()
    }  // end class ClassDataApp
}
