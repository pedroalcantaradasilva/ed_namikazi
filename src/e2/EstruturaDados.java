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
public class EstruturaDados {

    private Pessoa[] vetorPessoas;                 // cria a referência do vetor
    private int nElems;               // nElems controla quantos elementos o vetor terá ...
    //-----------------------------------------------------------

    public EstruturaDados(int max) // método construtor
    {
        vetorPessoas = new Pessoa[max];                 // cria o vetor ...
        nElems = 0;                        // inicialmente sem itens ...
    }

    public int size() {
        return nElems;
    }

    public int find(String searchName) {
        int lowerBound = 0;
        int upperBound = nElems - 1;
        int curIn;

        while (true) {
            curIn = (lowerBound + upperBound) / 2;
            if (vetorPessoas[curIn].equals(searchName)) {
                return curIn;
            } else if (lowerBound > upperBound) {
                return nElems;
            } else {
                if (vetorPessoas[curIn].compareTo(searchName)) {
                    lowerBound = curIn + 1;
                } else {
                    upperBound = curIn - 1;
                }
            }
        }
    }

    public void insert(String nome, String profissao, int idade) {
        int j;
        for (j = 0; j < nElems; j++) // localiza onde esse elemento se encaixa
        {
            if (vetorPessoas[j].compareTo(nome))
            {
                break;
            }
        }
        for (int k = nElems; k > j; k--) // move os elementos maiores uma posição p/ frente
        {
            vetorPessoas[k] = vetorPessoas[k - 1];
        }
        vetorPessoas[j] = vetorPessoas[nElems];
        nElems++;
        // comentario aqui
    }

    public boolean delete(String searchName) {                              // comentario aqui

        int j;
        for (j = 0; j < nElems; j++) // comentario aqui
        {
            if (vetorPessoas[j].getNome().equals(searchName)) {
                break;
            }
        }
        if (j == nElems) // comentario aqui
        {
            return false;
        } else // comentario aqui
        {
            for (int k = j; k < nElems; k++) // comentario aqui
            {
                vetorPessoas[k] = vetorPessoas[k + 1];
            }
            nElems--;                       // comentario aqui
            return true;
        }
    }  // end delete()

    public void display() // comentario aqui
    {
        for (int j = 0; j < nElems; j++) // comentario aqui
        {
            vetorPessoas[j].displayPessoa();// comentario aqui
        }
    }
}
