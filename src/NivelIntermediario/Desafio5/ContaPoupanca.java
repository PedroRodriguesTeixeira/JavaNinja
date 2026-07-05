package NivelIntermediario.Desafio5;

public class ContaPoupanca extends ContaBancaria {


    ContaPoupanca(double valor) {
        super(valor);
    }

    @Override
    public void depositar(double valor) {
        double valorPositivo = 0.0;
        valorPositivo = (valor * 0.1) - super.valor;
        super.valor += Math.abs(valorPositivo);
    }

}
