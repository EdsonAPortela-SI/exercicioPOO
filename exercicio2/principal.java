package exercicio2;

public class principal {

    public static void main (String[] args){

        item computador = new item();

        computador.setCodigo(123456);
        computador.setDescricao("Computador Ryzen  8gb ram, ssd 512gb ");
        computador.setPreco(6500.54);
        computador.setQuantidadeComprada(16);

        System.out.println(" Foram vendidos " + computador.getQuantidadeComprada()+ " unidades do " + computador.getDescricao()+" codigo " + computador.getCodigo() +" totalizando " + computador.getTotal() + " reais ");


    }
    
}
