package NivelIntermediario.Desafio5;

public class ContaCorrente extends ContaBancaria{

    ContaCorrente(double valor) {
        super(valor);
    }

    @Override
    public void depositar(double valor) {
        super.valor += valor;
    }


}
