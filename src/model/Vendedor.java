package model;

import java.time.LocalDate;

public class Vendedor extends Funcionario{
    private int quantidadeVendas;

    public Vendedor(String nome, Long cpf, LocalDate dataNascimento, Double salario){
        super(nome, cpf, dataNascimento, salario);
        this.quantidadeVendas = 0;
    }

    public Double calcularBonus(){
       return super.salario / 100 * quantidadeVendas;
    }

    public void realizarVenda(int quantidadeVendida){
        this.quantidadeVendas = this.quantidadeVendas + quantidadeVendida;
    }

    public int getQuantidadeVendas() {
        return quantidadeVendas;
    }

    public void setQuantidadeVendas(int quantidadeVendas) {
        this.quantidadeVendas = quantidadeVendas;
    }
}
