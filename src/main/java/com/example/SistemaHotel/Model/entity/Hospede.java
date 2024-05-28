package com.example.SistemaHotel.Model.entity;

public class Hospede extends Abstrata {
    
    private String nome;
    private String cpf;
    
    public Hospede(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
      }

    public Hospede(){};

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}
