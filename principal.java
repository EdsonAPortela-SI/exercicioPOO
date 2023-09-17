package exercicios;

public class principal {

    public static void main(String[] args) {

        Funcionario f1 = new Funcionario();
        Funcionario f2 = new Funcionario();

        f1.setNome("Ronaldo");
        f1.setSalarioMensal(1000);
        f1.setSobrenome("Richards");

        f2.setNome("Leticia");
        f2.setSobrenome("Cristina");
        f2.setSalarioMensal(5000.78);

        System.out.println("O nome do Funcionario e: " + f1.getNome() + " " + f1.getSobrenome() + " e seu salario e : "
                + f1.getSalarioMensal() + " e o anual : " + f1.getSalarioAnual() + "Com o aumento de 10%: "
                + f1.getAumento());
        System.out.println("O nome do Funcionario e: " + f2.getNome() + " " + f2.getSobrenome() + " e seu salario e : "
                + f2.getSalarioMensal() + " e o anual : " + f2.getSalarioAnual() + "Com o aumento de 10%: "
                + f2.getAumento());

    }
}
