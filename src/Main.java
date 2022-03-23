import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Java Básico");
        curso1.setDescricao("Introduçao ao Java");
        curso1.setCargaHoraria(10);

        Curso curso2 = new Curso();
        curso2.setTitulo("JavaScript");
        curso2.setDescricao("Introdução da Js");
        curso2.setCargaHoraria(5);
        //Polimorfismo. Nao consigo criar o Conteuo por ser abstrata
        //Mas poso criar Conteudo =new Curso pq Contedo é mae de mentoria.
//        Conteudo conteudo = new Curso();
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Conhecendo o Java");
        mentoria.setDescricao("Demonstrar o poder da linguagem Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome(" Primeiros Passos Na Programação");
        bootcamp.setDescricao("Conheça a Magia da Programação");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);


        Dev devEliza = new Dev();
        devEliza.setNome("Eliza Oliveira");
        devEliza.inscreverBootcamp(bootcamp);
        System.out.println(devEliza.getConteudosInscritos());
        devEliza.progredir();
        devEliza.progredir();
        System.out.println(devEliza.getConteudosConcluidos());
        devEliza.progredir();
        System.out.println(devEliza.getConteudosInscritos());
        System.out.println("XP " + devEliza.calcularXpTotal());
        System.out.println("---- Bootcamps-----");
        System.out.println(devEliza.getNome() + " Você ta Inscrita no Bootcap " + bootcamp.getNome());
        System.out.println("Inicio do Bootcamp " + bootcamp.getDataInicial());
        System.out.println("Finalize seu Bootcamp até "+ bootcamp.getDataFinal());


       /* System.out.println("--------");
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
        System.out.println("XP " + devJoana.calcularXpTotal());*/

    }
}
