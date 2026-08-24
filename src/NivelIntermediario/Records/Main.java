package NivelIntermediario.Records;

public class Main {

    public static void main(String[] args) {
        Ninja cadastro = new Ninja("Naruto", "naruto@email.com", 999);
        System.out.println("cadastro = " + cadastro);
        System.out.println("cadastro = " + cadastro.getNome());

        //Usando Records
        NinjaRecord cadastroUsandoRecord = new NinjaRecord("Sasuke", "sasuke@email.com", 888);
        System.out.println("cadastroUsandoRecord = " + cadastroUsandoRecord);
        System.out.println("email em caixa alta: " + cadastroUsandoRecord.emailCaixaAlta());
        System.out.println("Cadastro usando Records" + cadastroUsandoRecord.nome());
    }
    
}
