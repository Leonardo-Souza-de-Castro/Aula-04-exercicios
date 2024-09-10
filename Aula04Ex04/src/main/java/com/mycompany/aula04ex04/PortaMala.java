/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula04ex04;

/**
 *
 * @author Guilherme
 */
public class PortaMala {
    private float tamanho;
    
    private String tipoAbertura;

    public float getTamanho() {
        return tamanho;
    }

    public void setTamanho(float tamanho) {
        this.tamanho = tamanho;
    }

    public String getTipoAbertura() {
        return tipoAbertura;
    }

    public void setTipoAbertura(String tipoAbertura) {
        this.tipoAbertura = tipoAbertura;
    }

    @Override
    public String toString() {
        return "PortaMala{" + "tamanho=" + tamanho + ", tipoAbertura=" + tipoAbertura + '}';
    }
    
    
}
