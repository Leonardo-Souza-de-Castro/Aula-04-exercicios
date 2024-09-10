/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula04ex04;

/**
 *
 * @author Guilherme
 */
public class Motor {
    private String modelo;
    private int potencial;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPotencial() {
        return potencial;
    }

    public void setPotencial(int potencial) {
        this.potencial = potencial;
    }

    @Override
    public String toString() {
        return "Motor{" + "modelo=" + modelo + ", potencial=" + potencial + '}';
    }
    
    
}
