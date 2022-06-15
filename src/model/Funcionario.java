package model;

import java.time.LocalDate;

public class Funcionario {
    protected String nome;
    protected Long cpf;
    protected LocalDate dataNascimento;
    protected Double salario;

    public Funcionario(String nome, Long cpf, LocalDate dataNascimento, Double salario){
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.salario = salario;
    }
    public Double calcularBonus(){
       return this.salario / 100 * 5;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
}
