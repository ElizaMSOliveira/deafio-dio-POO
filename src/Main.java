import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição Curso Java");
        curso1.setCargaHoraria(10);


        Curso curso2 = new Curso();
        curso1.setTitulo("Curso js");
        curso1.setDescricao("Descrição Curso Js");
        curso1.setCargaHoraria(1);

        //Polimorfismo. Nõ consigo criar o Conteuo por ser abstrata
        //Mas poso criar Conteudo =new Curso pq Contedo é mae de mentoria.

        Conteudo conteudo = new Curso();




        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());

      /*  System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome(" Bootcamp java Developer");
        bootcamp.setDescricao(" Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devEliza = new Dev();
        devEliza.setNome("Eliza Oliveira");
        devEliza.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Eliza: " + devEliza.getConteudosInscritos());
        devEliza.progredir();
        devEliza.progredir();
        System.out.println("-->>");
        System.out.println("Conteudos Inscritos Eliza: " + devEliza.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Eliza: " + devEliza.getConteudosConcluidos());
        System.out.println("XP " + devEliza.calcularXpTotal());


        System.out.println("--------");
        Dev devJoana = new Dev();
        devJoana.setNome("Joanna Valetin");
        devJoana.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos João: " + devJoana.getConteudosInscritos());
        devJoana.progredir();
        devJoana.progredir();
        devJoana.progredir();
        System.out.println("-->>");
        System.out.println("Conteudos Inscritos João: " + devJoana.getConteudosInscritos());
        System.out.println("Conteudos Concluidos João: " + devJoana.getConteudosConcluidos());
        System.out.println("XP " + devJoana.calcularXpTotal());

    }
}
