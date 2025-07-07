import java.time.LocalDate;
import java.time.LocalDateTime;

import dio.desafio.domain.Bootcamp;
import dio.desafio.domain.Curso;
import dio.desafio.domain.Dev;
import dio.desafio.domain.Mentoria;

public class App {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso("Java", 8);
        Curso curso2 = new Curso("JavaScript", 4);
        
        curso1.setDescricao("Curso de Java Básico");
        curso2.setDescricao("Curso de JavaScript Básico");

        Mentoria mentoria1 = new Mentoria("Mentoria Java", "Mentoria sobre Java");
        Mentoria mentoria2 = new Mentoria("Mentoria JavaScript", "Mentoria sobre JavaScript");
        
        Bootcamp bootcamp = new Bootcamp("Bootcamp Java", "Bootcamp de Java e JavaScript");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);
        bootcamp.getConteudos().add(mentoria2);

        Dev dev1 = new Dev();
        dev1.setNome("Alice");
        dev1.increverBootcamp(bootcamp);
        Dev dev2 = new Dev();
        dev2.setNome("Bob");
        dev2.increverBootcamp(bootcamp);

        System.out.println("Conteúdos Inscritos Alice: " + dev1.getConteudosInscritos());
        dev1.progredir();
        System.out.println("Conteúdos Concluídos Alice: " + dev1.getConteudosConcluidos());
        System.out.println("Conteudos Inscritos Alice: " + dev1.getConteudosInscritos());

        dev1.progredir();
        System.out.println("Conteúdos Concluídos Alice: " + dev1.getConteudosConcluidos());
        System.out.println("Conteudos Inscritos Alice: " + dev1.getConteudosInscritos());

        System.out.println("-----------------------------------------");

        System.out.println("Conteúdos Inscritos Bob: " + dev2.getConteudosInscritos());
        dev2.progredir();
        System.out.println("Conteúdos Concluídos Bob: " + dev2.getConteudosConcluidos());
        System.out.println("Conteúdos Inscritos Bob: " + dev2.getConteudosInscritos());

    }
}
