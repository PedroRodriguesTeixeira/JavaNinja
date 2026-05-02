package NivelIntermediario;

public class Main {
    public static void main(String[] args) {

        //Objeto 1
        Uzumaki Naruto = new Uzumaki();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.idade = 17;
        Naruto.aldeia = "Aldeia da folha";
        Naruto.ModoSabioAtivado();

        //Objeto 2
        Uchiha Sasuke = new Uchiha();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.idade = 18;
        Sasuke.aldeia = "Aldeia da folha";
        Sasuke.SharinganAtivado();

        //Objeto 3
        Haruno Sakura = new Haruno();
        Sakura.nome = "Sakura Haruna";
        Sakura.idade = 18;
        Sakura.aldeia = "Aldeia da folha";
        Sakura.AtivarCura();

        //Objeto
        Hyuuga Hinata = new Hyuuga();
        Hinata.nome = "Hinata Hyuuga";
        Hinata.idade = 16;
        Hinata.aldeia = "Aldeia da folha";
        Hinata.AtivarByakugan();

        Boruto Boruto = new Boruto();
        Boruto.nome = "Boruto Hyuuga Uzumaki";
        Boruto.aldeia = "Aldeia da Folha";
        Boruto.idade = 9;

        //Aplicando métodos aos meus objetos
        System.out.println();
        String chamandoMetodo = Sasuke.euSouUmNinja();
        System.out.println(chamandoMetodo);
        int quantoTempoFalta = Sasuke.anosParaSeTornarHokage(70);
        System.out.println("Você tem " + Sasuke.idade + ", entao falta no mínimo: " + quantoTempoFalta + " anos para se tornar hokage.");

        //Interface
        Boruto.ModoSabioAtivado();
        Boruto.AtivarJougan();
        Boruto.AtivarOKarma();
    }
}
