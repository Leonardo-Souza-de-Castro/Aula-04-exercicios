package com.mycompany.aula04ex04;


public class Roda {
    private int quantRoda = 4;
    
    private String marca;

    public int getQuantRoda() {
        return quantRoda;
    }

    public void setQuantRoda(int quantRoda) {
        this.quantRoda = quantRoda;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Roda{" + "quantRoda=" + quantRoda + ", marca=" + marca + '}';
    }
}
