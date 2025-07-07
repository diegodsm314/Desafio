package dio.desafio.domain;

public class Curso extends Conteudo {
    private int cargaHoraria;


    @Override
    public double calcularXp() {
        return XP_PADRAO + cargaHoraria * 2d;
    }

    public Curso(String titulo, int cargaHoraria, String descricao) {
        this.cargaHoraria = cargaHoraria;
        super.setTitulo(titulo);
        super.setDescricao(descricao);
    }

    @Override
    public String toString() {
        return "Curso [titulo = " + super.getTitulo() + ", descricao = " + super.getDescricao() + ", cargaHoraria=" + cargaHoraria + "]";
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }


    public Curso(String titulo, int cargaHoraria) {
        super.setTitulo(titulo);
        this.cargaHoraria = cargaHoraria;
    }


}
