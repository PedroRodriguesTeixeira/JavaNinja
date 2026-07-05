package NivelIntermediario.Desafio5;

public class Main {

    public static void main(String[] args) {

        ContaPoupanca contaPoupanca = new ContaPoupanca(10.0);

        contaPoupanca.consultarSaldo();

        contaPoupanca.depositar(10.0);

        contaPoupanca.consultarSaldo();



    }

}
