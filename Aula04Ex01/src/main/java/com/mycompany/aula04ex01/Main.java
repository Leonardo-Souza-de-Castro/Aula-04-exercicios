package com.mycompany.aula04ex01;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList <Estudante> turma = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        String nome = "";
        String sobrenome = "";
        int identificador = 0;
    
        for(int i = 0; i < 2; i++){
            
            System.out.println("Digite o nome do aluno: ");
            nome = input.nextLine();
            
            System.out.println("Digite o sobrenome do aluno: ");
            sobrenome = input.nextLine();
            
            System.out.println("Digite o identificador do aluno: ");
            identificador = input.nextInt();
            
            input.nextLine();
            
            Estudante e = new Estudante(nome, sobrenome, identificador);
            
            turma.add(e);
        }
        
        for (Estudante aluno : turma) {
            System.out.println(aluno.toString());
        }
        
        
    }
}
