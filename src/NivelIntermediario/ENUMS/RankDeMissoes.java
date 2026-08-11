package NivelIntermediario.ENUMS;

public enum RankDeMissoes {

    D("Baixo", 2),
    C("Moderado", 3),
    B("Confortável", 4),
    A("Difícil", 5),
    S("Altíssimo", 12);

    private String descricao;
    private int dificuldade;

    RankDeMissoes(String descricao, int dificuldade) {
        this.dificuldade = dificuldade;
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(int dificuldade) {
        this.dificuldade = dificuldade;
    }
}
