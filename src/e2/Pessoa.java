/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e2;

/**
 *
 * @author Aluno
 */
public class Pessoa {

    private String nome, profissao;
    private int idade;

    public Pessoa(String nome, String profissao, int idade) {
        this.nome = nome;
        this.profissao = profissao;
        this.idade = idade;
    }

    public void displayPessoa() {
        System.out.print("\nNome : " + nome);
        System.out.print("\nProfissão : " + profissao);
        System.out.println("\nIdade: " + idade);
    }

    public String getNome() {
        return nome;
    }   
    
}
