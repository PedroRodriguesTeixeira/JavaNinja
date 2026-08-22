package NivelIntermediario.Generics;

import java.util.ArrayList;
import java.util.List;

public class BolsaUsandoGenerics<T> {

    private List<T> equipamentos;

    public BolsaUsandoGenerics() {
        this.equipamentos = new ArrayList<>();
    }

    //Colcar equipamentos Genericos
    public void adicionarEquipamentos(T equipamento) {
        this.equipamentos.add(equipamento);
    }

    public List<T> getEquipamentos() {
        return equipamentos;
    }

    public void setEquipamentos(List<T> equipamentos) {
        this.equipamentos = equipamentos;
    }

    @Override
    public String toString() {
        return "Bolsa de equipamentos: " + equipamentos.toString();
    }
}
