package model;

import java.time.LocalDate;

public class Caixa  extends Funcionario{
    public Caixa(String nome, Long cpf, LocalDate dataNascimento, Double salario) {
        super(nome, cpf, dataNascimento, salario);
    }
}
