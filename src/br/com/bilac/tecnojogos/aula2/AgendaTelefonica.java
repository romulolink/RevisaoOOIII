package br.com.bilac.tecnojogos.aula2;

import java.util.Scanner;

/**
 * Created by Work on 05/02/2015.
 */
public class AgendaTelefonica {

    private Pessoa[] pessoas;
    private Scanner scanner;

    public AgendaTelefonica() {
        pessoas = new Pessoa[5];
        scanner = new Scanner(System.in);
    }

    public void cadastrarPessoa(){
        for (int i =0; i < pessoas.length; i++){
            System.out.printf("\nInsira um nome para a pessoa: ");
            String nome = scanner.next();
            System.out.printf("\nInsira um telefone para a pessoa: ");
            String telefone = scanner.next();
            System.out.printf("\nInsira um email para a pessoa: ");
            String email = scanner.next();
            Pessoa nova = new Pessoa(nome,telefone,email);
            pessoas[i] = nova;
            System.out.printf("\nNovo contato adicionado \n");
            break;
        }

    }

    public void impimirOpcoes(){
        System.out.printf("\n Escolha uma das opções: \n");
        System.out.printf("1 - Listar contatos. \n");
        System.out.printf("2 - Incluir contatos. \n");
        System.out.printf("3 - Sair \n");
    }


    public void imprimirPessoas(){
        for(Pessoa pessoa:pessoas){
            if(pessoa != null){
                System.out.printf("\n Nome: "+pessoa.getNome()+"\nTelefone: "
                        +pessoa.getTelefone()+"\nEmail:"+pessoa.getEmail());
            }
        }
    }

    public Pessoa[] getPessoas(){
        return pessoas;
    }

    public void setPessoas(Pessoa[] pessoas){
        this.pessoas = pessoas;
    }
}
