/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula04ex04;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Guilherme
 */
public class Main {
    public static void main(String[] args) {
        ArrayList <Carro> carros  = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        
        for (int i = 0; i < 3; i++) {
            Banco b1 = new Banco();
            System.out.println("Digite a cor dos bancos: ");
            b1.setCor(input.nextLine());

            Carroceria c1 = new Carroceria();
            System.out.println("Digite a cor da carroceria: ");
            c1.setCor(input.nextLine());
            System.out.println("Digite o tipo de pintura: ");
            c1.setTipoDePintura(input.nextLine());

            Combustivel cb1 = new Combustivel();
            cb1.setCapacidadeTanque(25);
            System.out.println("Digite o tipo de combustivel: ");
            cb1.setTipo(input.nextLine());

            Janela j1 = new Janela();
            j1.setQuantidade(4);
            System.out.println("Digite o tipo de janela: ");
            j1.setTipo(input.nextLine());

            Motor m1 = new Motor();
            System.out.println("Digite o modelo do motor: ");
            m1.setModelo(input.nextLine());
            m1.setPotencial(6);

            Porta p1 = new Porta();
            System.out.println("Digite a cor das portas: ");
            p1.setCor(input.nextLine());
            p1.setQuantidade(4);

            PortaMala pm1 = new PortaMala();
            pm1.setTamanho(15);
            pm1.setTipoAbertura("Automatica");

            Roda r1 = new Roda();
            r1.setMarca("Pireli");

            TetoSolar ts = new TetoSolar();
            ts.setContem(true);
            ts.setTipo("eletetrico");

            Volante v1 = new Volante();
            v1.setMarca("Volvo");
            v1.setTipoDirecao("Hidraulica");

            Carro car1 = new Carro(b1,c1,cb1,j1,m1,p1,pm1,r1,ts,v1);
            
            carros.add(car1);
        }
        
        for(Carro c : carros){
            System.out.println(c.toString());
        }

    }
}
