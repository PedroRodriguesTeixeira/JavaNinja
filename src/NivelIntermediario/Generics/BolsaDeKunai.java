package NivelIntermediario.Generics;

import java.util.ArrayList;
import java.util.List;

public class BolsaDeKunai {

    private List<Kunai> kunais;

    public BolsaDeKunai() {
        this.kunais = new ArrayList<>();
    }


    public List<Kunai> getKunais() {
        return kunais;
    }

    public void setKunais(List<Kunai> kunais) {
        this.kunais = kunais;
    }

    public void adicionarKunai(Kunai kunai) {
        this.kunais.add(kunai);
    }

    @Override
    public String toString(){
        return "Bolsa de Kunais: " + kunais.toString();
    }
}
