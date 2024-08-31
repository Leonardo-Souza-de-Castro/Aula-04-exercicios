package com.mycompany.aula04ex01;

public class Estudante {
    private String nome, sobrenome;
    private int identificador;
    private static int proximoId = 0;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public static int getProximoId() {
        return proximoId;
    }

    public static void setProximoId(int proximoId) {
        Estudante.proximoId = proximoId;
    }

    public Estudante(String nome, String sobrenome, int identificador) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.identificador = identificador;
        this.proximoId = proximoId + 1;
    }

    @Override
    public String toString() {
        return "Estudante{" + "nome=" + nome + ", sobrenome=" + sobrenome + ", identificador=" + identificador + ", ID=" + proximoId +'}';
    }
    
    
}
