package NivelIntermediario.Generics;

public class Main {

    public static void main(String[] args) {

        //Sem suar Generics

        Kunai kunai1 = new Kunai("Kunai explosiva");
        Kunai kunai2 = new Kunai("Kunai venenosa");

        BolsaDeKunai bolsaDeKunai = new BolsaDeKunai();
        bolsaDeKunai.adicionarKunai(kunai1);
        bolsaDeKunai.adicionarKunai(kunai2);
        System.out.println(bolsaDeKunai);

        System.out.println();

        // Usando Generics

        EquipamentoUsandoGenerics kunai =  new EquipamentoUsandoGenerics("Kunai normal");
        EquipamentoUsandoGenerics shuriken =  new EquipamentoUsandoGenerics("Shuriken");
        EquipamentoUsandoGenerics pergaminho =  new EquipamentoUsandoGenerics("Pergaminho");

        BolsaUsandoGenerics<EquipamentoUsandoGenerics> bolsaUsandoGenerics = new BolsaUsandoGenerics<>();
        bolsaUsandoGenerics.adicionarEquipamentos(kunai);
        bolsaUsandoGenerics.adicionarEquipamentos(shuriken);
        bolsaUsandoGenerics.adicionarEquipamentos(pergaminho);

        System.out.println(bolsaUsandoGenerics);



    }

}
