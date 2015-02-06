package br.com.bilac.tecnojogos.aula2;

import java.util.Scanner;

public class Main {

    private static Scanner scanner;

    public static void main(String[] args) {

        scanner = new Scanner(System.in);
        AgendaTelefonica agenda = new AgendaTelefonica();
        int sair = 0;
        int opcao = 0;
        while (sair == 0){

            switch (opcao){

                case 0:{
                    agenda.impimirOpcoes();
                    opcao = scanner.nextInt();
                    break;
                }
                case 1:{
                    agenda.imprimirPessoas();
                    opcao = 0;
                    break;
                }
                case 2:{
                    agenda.cadastrarPessoa();
                    opcao = 0;
                    break;
                }
                case 3:{
                    sair = 1;
                    System.out.printf("\nAté mais!\n");
                    break;
                }
                default:{
                    agenda.impimirOpcoes();
                    opcao = scanner.nextInt();
                    break;

                }

            }

        }
    }
}
