import model.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Produto camiseta = new Produto(4545L, "camiseta", 10.0,20);

        camiseta.getCodigo();

        camiseta.venderProduto(1);

        System.out.println();
        boolean estaDisponivel = camiseta.disponibilidade();

        if(!estaDisponivel){
            System.out.println("nao ta disponivel");
        } else{
            System.out.println("esta ta disponivel");
        }

        Vendedor vendedor = new Vendedor("joao", 3434L,LocalDate.of(1998, 07, 01), 100.0 );

        vendedor.realizarVenda(3);
        Double bonus = vendedor.calcularBonus();
        System.out.println("O bonus desse funcionario e de" + bonus);

        Caixa caixa =  new Caixa("gig", 43543L,LocalDate.of(1997, 05, 10), 1000.0);

        Gerente gerente = new Gerente("carlos", 5654L, LocalDate.of(1998, 06, 02), 2000.0);

        gerente.apurarMeta(80, vendedor);
        gerente.apurarMeta(90, caixa);

    }
}
