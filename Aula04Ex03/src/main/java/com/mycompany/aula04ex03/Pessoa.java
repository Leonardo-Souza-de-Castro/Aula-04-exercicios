package com.mycompany.aula04ex03;

/**
 *
 * @author uniflcastro
 */
public class Pessoa {

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    private String nome;
    private String telefone;
    
    public static int contador = 0;

    public int getId() {
        return Id;
    }

    public int Id;

    public Pessoa(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
        this.Id = contador++;
    }
}
