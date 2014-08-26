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
public class Usuario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        {
            int maxSize = 6;
            EstruturaDados estruturaDados;
            estruturaDados = new EstruturaDados(maxSize);
            estruturaDados.insert("Jonatas", "Desenvolvedor", 22);
            estruturaDados.insert("Alexandre", "Professor", 34);
            estruturaDados.insert("Peter", "DBA", 44);
            estruturaDados.insert("Jabes", "Concultor", 55);
            estruturaDados.insert("Alarick", "Analisa de Sistemas", 38);
            estruturaDados.display();
            int resultado = estruturaDados.find(JOptionPane.showInputDialog(null, "Digite um nome para procurar"));
            if (resultado != estruturaDados.size()) {
                System.out.print("\nENCONTRADO\n");
                estruturaDados.displayUnico(resultado);
            } else {
                System.out.println("\nNÃO ENCONTRADO\n");
            }
            String deletarNome = JOptionPane.showInputDialog(null, "Digite um nome para deletar");
            if (!estruturaDados.delete(deletarNome)) {
                System.out.println("\nNÃO ENCONTRADO\n");
            }
            System.out.println("\nObjetos restantes no ARRAY:");
            estruturaDados.display();
        }
    }
}
