package NivelBasico.TipoDeDados;

public class DadosNaoPrimitivos {
    public static void main(String[] args) {
        /*
        * Dados não primitivos: String, Array, Class, Enum
        * */

        String nome = "Naruto Uzumaki";
        String nomeToUpperCase = nome.toUpperCase(); //ToUppercase vai colocar tudo em CAPSLOCK
        System.out.println("Esse textoe esta em CAPSLOCK: " + nomeToUpperCase);
        System.out.println("Esse texto esta normal: " + nome);

        String aldeia = "ALDEIA DA FOLHA";
        String aldeiaEmCaixaBaixa = aldeia.toLowerCase(); //ToLowerCase vai colocar tudo em caixa baixa/minusculo.
        System.out.println(aldeia);
    }
}
