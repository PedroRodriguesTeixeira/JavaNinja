package NivelIntermediario.Generics;

public class EquipamentoUsandoGenerics {

    private String nome;

    public EquipamentoUsandoGenerics(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString(){
        return  nome;
    }
}
