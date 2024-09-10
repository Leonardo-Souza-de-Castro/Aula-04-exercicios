package com.mycompany.aula04ex03;

import java.util.Scanner;
import java.util.ArrayList;


public class Main {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String entrada;
        String nome = "";
        String telefone = "";
        
        ArrayList <Pessoa> agenda = new ArrayList<>();


        while(true){
            System.out.println("Bem vindo a agenda digite uma opção para seguir: ");
            System.out.println("n - Criar novo contato");
            System.out.println("d - Deletar um contato");
            System.out.println("p - Imprimir agenda");
            System.out.println("q - Sair");

            entrada = input.nextLine();
            
            switch(entrada){
                case "n":
                    System.out.println("Digite o nome: ");
                    nome = input.nextLine();
                    System.out.println("Digite o telefone: ");
                    telefone = input.nextLine();

                    Pessoa p = new Pessoa(nome, telefone);

                    agenda.add(p);
                    
                    break;
                case "d":
                    System.out.println("Digite o nome "
                            + "da pessoa a ser removido: ");
                    
                    nome = input.nextLine();
                    
                    for (int i = 0; i < agenda.size(); i++) {
                        
                        Pessoa pess = agenda.get(i);
                        
                        if(pess.getNome().equals(nome)){
                            agenda.remove(i);
                            i--;
                        }
                    }
                    break;
                    
                case "p":
                    for(Pessoa j : agenda){
                        System.out.println("ID - " + j.getId() + "| Nome - " 
                        + j.getNome() + "| Telefone - " + j.getTelefone() +"|");
                    }
                    break;
                    
                case "q":
                    System.out.println("Encerrando programa...");
                    return;
            }

        }
    }
}
