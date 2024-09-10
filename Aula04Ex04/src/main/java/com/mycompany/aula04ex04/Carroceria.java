/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula04ex04;

/**
 *
 * @author Guilherme
 */
public class Carroceria {
    private String cor;
    
    private String tipoDePintura;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTipoDePintura() {
        return tipoDePintura;
    }

    public void setTipoDePintura(String tipoDePintura) {
        this.tipoDePintura = tipoDePintura;
    }

    @Override
    public String toString() {
        return "Carroceria{" + "cor=" + cor + ", tipoDePintura=" + tipoDePintura + '}';
    }
    
}
