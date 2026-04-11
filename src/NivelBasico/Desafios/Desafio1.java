package NivelBasico.Desafios;

public class Desafio1 {

    public static void main(String[] args) {

        //NINJA 1
        String nomeNinja1 = "Naruto Uzumaki";
        int idadeNinja1 = 12;
        String missaoNinja1 = "Encontrar o bandido.";
        char nivelDeDificuldadeMissaoNinja1 = 'A';
        String statusMissaNinja1 = "Em andamento.";

        System.out.println("Nome do ninja: " + nomeNinja1);
        System.out.println("Idade do ninja: " + idadeNinja1);
        System.out.println("Missão do ninja: " + missaoNinja1);
        System.out.println("Status da missão: " + statusMissaNinja1);
        System.out.println("Nível da missão: " + nivelDeDificuldadeMissaoNinja1);

        if(idadeNinja1 > 15){
            statusMissaNinja1 = "Concluída.";
            System.out.println("Status da missao: " + statusMissaNinja1);
        } else{
            if (nivelDeDificuldadeMissaoNinja1 == 'C' || nivelDeDificuldadeMissaoNinja1 == 'D') {
                statusMissaNinja1 = "Concluída.";
                System.out.println("Status da missao: " + statusMissaNinja1);
            } else{
                statusMissaNinja1 = "Não concluída. Ninja sem idade suficiente para finalizar uma missão de nível"
                        + nivelDeDificuldadeMissaoNinja1;
                System.out.println("Status da missao: " + statusMissaNinja1);
            }
        }

        System.out.println("-----------------------------------------");

        //NINJA 2
        String nomeNinja2 = "Sakura Haruno";
        int idadeNinja2 = 23;
        String missaoNinja2 = "Curar feridos de guerra.";
        char nivelDeDificuldadeMissaoNinja2 = 'S';
        String statusMissaNinja2 = "Concluída.";

        System.out.println("Nome do ninja: " + nomeNinja2);
        System.out.println("Idade do ninja: " + idadeNinja2);
        System.out.println("Missão do ninja: " + missaoNinja2);
        System.out.println("Nível da missão: " + nivelDeDificuldadeMissaoNinja2);

        if(idadeNinja2> 15){
            statusMissaNinja2 = "Concluída.";
            System.out.println("Status da missao: " + statusMissaNinja2);
        } else{
            if (nivelDeDificuldadeMissaoNinja2 == 'C' || nivelDeDificuldadeMissaoNinja2 == 'D') {
                statusMissaNinja2 = "Concluída.";
                System.out.println("Status da missao: " + statusMissaNinja2);
            } else{
                statusMissaNinja2 = "Não concluída. Ninja sem idade suficiente para finalizar uma missão de nível"
                        + nivelDeDificuldadeMissaoNinja2;
                System.out.println("Status da missao: " + statusMissaNinja2);
            }
        }

        System.out.println("-----------------------------------------");

        //NINJA 3

        String nomeNinja3 = "Sasuke Uchiha";
        int idadeNinja3 = 12;
        String missaoNinja3 = "Reconhecimento da aldeia.";
        char nivelDeDificuldadeMissaoNinja3 = 'D';
        String statusMissaNinja3 = "Em andamento.";

        System.out.println("Nome do ninja: " + nomeNinja3);
        System.out.println("Idade do ninja: " + idadeNinja3);
        System.out.println("Missão do ninja: " + missaoNinja3);
        System.out.println("Nível da missão: " + nivelDeDificuldadeMissaoNinja3);

        if(idadeNinja3 > 15){
            statusMissaNinja3 = "Concluída.";
            System.out.println("Status da missao: " + statusMissaNinja3);
        } else{
            if (nivelDeDificuldadeMissaoNinja3 == 'C' || nivelDeDificuldadeMissaoNinja3 == 'D') {
                statusMissaNinja3 = "Concluída.";
                System.out.println("Status da missao: " + statusMissaNinja3);
            } else{
                statusMissaNinja3 = "Não concluída. Ninja sem idade suficiente para finalizar uma missão de nível"
                        + nivelDeDificuldadeMissaoNinja3;
                System.out.println("Status da missao: " + statusMissaNinja3);
            }
        }

        System.out.println("-----------------------------------------");






    }
}
