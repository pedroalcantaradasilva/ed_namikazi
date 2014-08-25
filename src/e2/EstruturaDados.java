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
    
    public Pessoa find(String searchName)
      {                              // comentario aqui
      int j;
      for(j=0; j<nElems; j++)            // comentario aqui
         if( vetorPessoas[j].getNome().equals(searchName) )  // comentario aqui
            break;                       // comentario aqui
      if(j == nElems)                    // comentario aqui
         return null;                    // comentario aqui
      else
         return vetorPessoas[j];                    // comentario aqui
      }  // end find()
    
    public void insert(String nome, String profissao, int idade)
      {
      vetorPessoas[nElems] = new Pessoa(nome, profissao, idade);
      nElems++;                          // comentario aqui
      }
    
    public boolean delete(String searchName)
      {                              // comentario aqui
      int j;
      for(j=0; j<nElems; j++)            // comentario aqui
         if( vetorPessoas[j].getNome().equals(searchName) )
            break;
      if(j==nElems)                     // comentario aqui
         return false;
      else                               // comentario aqui
         {
         for(int k=j; k<nElems; k++)    // comentario aqui
            vetorPessoas[k] = vetorPessoas[k+1];
         nElems--;                       // comentario aqui
         return true;
         }
      }  // end delete()
    
    public void display()            // comentario aqui
      {
      for(int j=0; j<nElems; j++)       // comentario aqui
         vetorPessoas[j].displayPessoa();// comentario aqui
      }
}
