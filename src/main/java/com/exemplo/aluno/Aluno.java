package com.exemplo.aluno;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idaluno;

    @NotNull
    private String nome;

    private String curso;

    private int idade;

    public Long getIdaluno() {
        return idaluno;
    }

    public void setIdaluno(Long idaluno) {
        this.idaluno = idaluno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
