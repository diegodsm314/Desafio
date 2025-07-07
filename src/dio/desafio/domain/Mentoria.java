package dio.desafio.domain;


public class Mentoria extends Conteudo {

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }


    public Mentoria() {
    }

    public Mentoria(String titulo, String descricao) {
        super.setTitulo(titulo);
        super.setDescricao(descricao);
    }


    @Override
    public String toString() {
        return "Mentoria [titulo=" + getTitulo() + ", descricao=" + getDescricao() 
                + "]";
    }

   


}
