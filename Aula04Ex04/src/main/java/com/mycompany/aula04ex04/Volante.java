/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula04ex04;

/**
 *
 * @author Guilherme
 */
public class Volante {
    private String tipoDirecao;
    
    private String marca;

    public String getTipoDirecao() {
        return tipoDirecao;
    }

    public void setTipoDirecao(String tipoDirecao) {
        this.tipoDirecao = tipoDirecao;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Volante{" + "tipoDirecao=" + tipoDirecao + ", marca=" + marca + '}';
    }
    
    
}
