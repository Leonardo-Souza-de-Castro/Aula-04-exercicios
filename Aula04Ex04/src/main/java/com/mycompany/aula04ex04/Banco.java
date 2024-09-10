package com.mycompany.aula04ex04;

public class Banco {
    private int quantidade = 5;
    
    private String cor;

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Banco{" + "quantidade=" + quantidade + ", cor=" + cor + '}';
    }
    
    
}
