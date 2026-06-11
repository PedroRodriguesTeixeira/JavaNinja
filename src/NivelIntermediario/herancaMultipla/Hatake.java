package NivelIntermediario.herancaMultipla;

public class Hatake extends Ninja implements AnbuInterface,  SharinganInterface {

    public void sharinganAtivado() {
        System.out.println(nome + " ativou o sharingan!");
    }
    public void ninjaDeEleite() {
        System.out.println(nome + "Eu sou um ninja de elite da ANBU");
    }
}
