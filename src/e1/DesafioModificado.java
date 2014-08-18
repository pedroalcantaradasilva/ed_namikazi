/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e1;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
class EstruturaDeDados {

    private final String[] nomes;
    private int i;
    private String todosOsNomes = "";

    public EstruturaDeDados(int max) {
        nomes = new String[max];
        i = 0;
    }

    public void InserirNomes(String nome) {
        nomes[i] = nome;
        i++;
    }

    public String ProcuraNome(char letra) {
        for (String nome : nomes) {
            if (nome.charAt(0) == letra) {
                todosOsNomes = todosOsNomes.concat("[" + nome + "]");
            }
        }
        if (todosOsNomes.equals("")) {
            todosOsNomes = "Nenhum Resultado encontrado";
        }
        return todosOsNomes;
    }

    public void exibirResultados() {
        JOptionPane.showMessageDialog(null, "Resultado: " + todosOsNomes + "");
    }

    public boolean removerNomes(String nome) {
        int j;
        for (j = 0; j < i; j++) {
            if (nome.equals(nomes[j])) {
                break;
            }
        }
        if (j == i) {
            return false;
        } else {
            for (int k = j; k+1 < i; k++) {
                nomes[k] = nomes[k + 1];
            }
            i--;
            return true;
        }
    }

    public String exibirVetorAlterado() {
        String x = "";
        for (int j = 0; j < i; j++) {
            x = x.concat("[" + nomes[j] + "]");
        }
        return x;
    }
}

public class DesafioModificado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EstruturaDeDados estruturaDeDados;
        int max = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de nomes que deseja armazenar no vetor", "Pergunta", JOptionPane.QUESTION_MESSAGE));
        estruturaDeDados = new EstruturaDeDados(max);
        for (int i = 0; i < max; i++) {
            estruturaDeDados.InserirNomes(JOptionPane.showInputDialog(null, "Digite o " + (i + 1) + "º nome:"));
        }
        estruturaDeDados.ProcuraNome(JOptionPane.showInputDialog(null, "Digite uma letra para pesquisar nomes com suas iniciais").charAt(0));
        estruturaDeDados.exibirResultados();
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja excluir algum nome?", "Pergunta", JOptionPane.OK_CANCEL_OPTION);
        if (resposta == JOptionPane.OK_OPTION) {
            String excluir = JOptionPane.showInputDialog(null, "Digite o nome que deseja excluir");
            boolean verifica = estruturaDeDados.removerNomes(excluir);
            if (verifica == true) {
                JOptionPane.showMessageDialog(null, "Nome excluido com sucesso");
            } else {
                JOptionPane.showMessageDialog(null, "Esse nome não existe no vetor de nomes");
                return;
            }
        }
        if (resposta == JOptionPane.CANCEL_OPTION) {
            System.exit(0);
        }
        JOptionPane.showMessageDialog(null, "Seu vetor depois da exclusão é: " + estruturaDeDados.exibirVetorAlterado());
    }

}
