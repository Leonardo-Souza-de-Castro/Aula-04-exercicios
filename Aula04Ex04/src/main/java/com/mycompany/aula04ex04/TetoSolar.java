/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula04ex04;

/**
 *
 * @author Guilherme
 */
public class TetoSolar {
    private boolean Contem = false;
    
    private String tipo;

    public boolean isContem() {
        return Contem;
    }

    public void setContem(boolean Contem) {
        this.Contem = Contem;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "TetoSolar{" + "Contem=" + Contem + ", tipo=" + tipo + '}';
    }
    
    
}
