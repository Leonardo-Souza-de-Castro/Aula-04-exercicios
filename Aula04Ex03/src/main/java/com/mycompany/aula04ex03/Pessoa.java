package com.mycompany.aula04ex03;

/**
 *
 * @author uniflcastro
 */
public class Pessoa {
    private String nome;
    private String telefone;
    
    public static int contador = 0;
    public int Id;

    public Pessoa(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
        this.Id = contador++;
    }
}
