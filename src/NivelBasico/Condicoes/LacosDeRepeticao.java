package NivelBasico.Condicoes;

public class LacosDeRepeticao {

    public static void main(String[] args) {
        /*
        * Laço de Repeticao: Vao repetir infinitamente ou até você atingir o parâmetro desejado.
        * While & FOR
        * */

        // While -> while (condicaoVerdadeira) {Trecho de código}

        int numeroDeClone = 0;
        int numeroMaximoDeClones = 40;

        /*while (numeroDeClone < numeroMaximoDeClones) {
            numeroDeClone++;
            System.out.println("O nartuo fez um clone das sombras " + numeroDeClone);
        }*/

        //FOR
        for (int i = 0; i <= numeroMaximoDeClones; i++) {
            System.out.println("O nartuo fez um clone das sombras " + i);
        }

    }
}
