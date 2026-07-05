package NivelIntermediario.Desafio5;

public abstract class ContaBancaria implements Conta {

    double valor;

    ContaBancaria(double valor) {
        this.valor = valor;
    }


    @Override
    public void consultarSaldo() {
        System.out.println("Seu saldo atual é de " + valor);
    }

    @Override
     abstract public void depositar(double valor);
}
