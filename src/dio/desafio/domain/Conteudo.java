package dio.desafio.domain;

public abstract class Conteudo {

    protected static final double XP_PADRAO = 10d;

    private String titulo;
    private String descricao;

    public static double getXpPadrao() {
        return XP_PADRAO;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Conteudo [titulo=" + titulo + ", descricao=" + descricao + "]";
    }

    public abstract double calcularXp();
    
}
