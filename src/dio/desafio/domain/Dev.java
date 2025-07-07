package dio.desafio.domain;

import java.util.LinkedHashSet;
import java.util.Set;

public class Dev {
    private String nome;
    Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    public void increverBootcamp(Bootcamp bootcamp) {
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);
    }

    public void progredir() {
        this.conteudosInscritos.stream().findFirst().ifPresent(conteudo -> {
            this.conteudosConcluidos.add(conteudo);
            this.conteudosInscritos.remove(conteudo);
        });
    }

    public double calcularTotalXp() {
        return this.conteudosConcluidos.stream()
                .mapToDouble(Conteudo::calcularXp)
                .sum();
    }

    public void inscreverConteudo(Conteudo conteudo) {
        this.conteudosInscritos.add(conteudo);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    @Override
    public String toString() {
        return "Dev [nome=" + nome + ", conteudosInscritos=" + conteudosInscritos + ", conteudosConcluidos="
                + conteudosConcluidos + "]";
    }

}
