package NivelIntermediario.Records;

public record NinjaRecord(
        String nome,
        String email,
        int telefone
) {

    //Todos os atributos são FINAL por padrão, ou seja, o atributos não podem ser alterados.
    //Records não possuem setters
    //Diferentemente de um classe normal, o Records não cria uma classe get com o padrão getNome, apenas cria um classe get como próprio nome da classe.

    public String emailCaixaAlta() {
        return email.toUpperCase();
    }
}
