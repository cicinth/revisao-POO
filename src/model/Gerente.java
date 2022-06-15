package model;

import java.time.LocalDate;

public class Gerente extends Funcionario {
    public Gerente(String nome, Long cpf, LocalDate dataNascimento, Double salario) {
        super(nome, cpf, dataNascimento, salario);
    }

    public Double calcularBonus(){
        return salario / 100 * 20;
    }

    public void apurarMeta(double percentualAtingido, Funcionario funcionario){
        if(percentualAtingido > 70){
            System.out.println(funcionario.getNome() + "atingiu a meta");
        }else {
            System.out.println(funcionario.getNome() + "nao atingiu a meta");
        }
    }

}
