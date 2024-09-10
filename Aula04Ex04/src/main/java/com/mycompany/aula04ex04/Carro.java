/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula04ex04;

/**
 *
 * @author Guilherme
 */
public class Carro {
    private Banco banco;
    private Carroceria carroceria;
    private Combustivel Combustivel;
    private Janela janela;
    private Motor motor;
    private Porta porta;
    private PortaMala portaMala;
    private Roda rodas;
    private TetoSolar teto;
    private Volante volante;

    public Carro(Banco banco, Carroceria carroceria, Combustivel Combustivel, Janela janela, Motor motor, Porta porta, PortaMala portaMala, Roda rodas, TetoSolar teto, Volante volante) {
        this.banco = banco;
        this.carroceria = carroceria;
        this.Combustivel = Combustivel;
        this.janela = janela;
        this.motor = motor;
        this.porta = porta;
        this.portaMala = portaMala;
        this.rodas = rodas;
        this.teto = teto;
        this.volante = volante;
    }

    @Override
    public String toString() {
        return "Carro{" + "banco=" + banco + ", carroceria=" + carroceria + ", Combustivel=" + Combustivel + ", janela=" + janela + ", motor=" + motor + ", porta=" + porta + ", portaMala=" + portaMala + ", rodas=" + rodas + ", teto=" + teto + ", volante=" + volante + '}';
    }
    
    
    
    
}
