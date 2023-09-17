package exercicio2;

public class item {
    /*
     * Crie uma classe chamada Item que uma loja de suprimentos de informática possa
     * utilizar
     * para representar uma fatura de um item vendido na loja. Um Item faturado deve
     * ter quatro
     * atributos: código, descrição, quantidade comprada do item, preço do item. Sua
     * classe deve
     * fornecer métodos get e set para cada um dos atributos. Forneça também um
     * método
     * chamado getTotal que calcula e retorna o total a pagar sobre o item faturado
     * (ou seja, quantidade * preço). Se a quantidade não for positiva, deve ser
     * configurada como zero.
     * Idem para preço. Escreva um programa que teste a
     * 
     */

    private int codigo;
    private String descricao;
    private int quantidadeComprada;
    private double preco;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidadeComprada() {
        return quantidadeComprada;
    }

    public void setQuantidadeComprada(int quantidadeComprada) {
        this.quantidadeComprada = quantidadeComprada;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getTotal() {
        double total = quantidadeComprada * preco;
        if (quantidadeComprada < 0){
            total = 0;
        }
        return total;
    }

}
