package exercicios;

public class Funcionario {

    private String nome;
    private String sobrenome;
    private double salarioMensal;
    private double salarioAnual;
    private double aumento;

    public double getAumento() {
        aumento = salarioMensal * 0.1;
        salarioMensal = salarioMensal + aumento;

        return salarioMensal;
    }

    public void setAumento(double aumento) {
        this.aumento = aumento;
    }

    public double getSalarioAnual() {
        salarioAnual = salarioMensal * 12;
        return this.salarioAnual;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public String setNome(String nome) {
        return this.nome = nome;
    }

    public String setSobrenome(String sobrenome) {
        return this.sobrenome = sobrenome;
    }

    public double setSalarioMensal(double salarioMensal) {

        if (salarioMensal >= 0) {

            this.salarioMensal = salarioMensal;
        }

        else {

            this.salarioMensal = 0;

        }
        return salarioMensal;
    }
}
