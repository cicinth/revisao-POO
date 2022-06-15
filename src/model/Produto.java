package model;


public class Produto {
    private Long codigo;
    private String nomeProduto;
    private double valor;
    private int quantidadeEstoque;


    public Produto(Long codigo, String nomeProduto, double valor, int quantidadeEstoque){
        this.codigo = codigo;
        this.nomeProduto = nomeProduto;
        this.valor = valor;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public Produto(Long codigo, String nomeProduto, double valor){
        this.codigo = codigo;
        this.nomeProduto = nomeProduto;
        this.valor = valor;
    }


    public void venderProduto(int quantidadeVendida){
        this.quantidadeEstoque = this.quantidadeEstoque - quantidadeVendida;
    }

    public void aumentarEstoque(int quantidaRecebida){
        this.quantidadeEstoque = this.quantidadeEstoque +  quantidaRecebida;
    }

    public boolean disponibilidade(){
        if(this.quantidadeEstoque <= 0 ){
            return  false;
        } else{
            return true;
        }
    }


    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }
}


