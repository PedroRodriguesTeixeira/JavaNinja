package NivelBasico.Condicoes;

public class Ternarios {

    public static void main(String[] args) {

        /*
        * Ternarios: Sao maneiras de reduzir o codigo.
        * variavel = (condicao) ? valorSeVerdadeiro : valorSefalso;
        * */

        short numeroDeMissoes = 1;
        String nivelDoNinja = (numeroDeMissoes >= 10) ? "Esse ninja está com mais de 10 missões" :
                "Esse ninja está com menos de 10 missões";
        System.out.println(nivelDoNinja);
    }
}
