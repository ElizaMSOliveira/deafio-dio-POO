package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Mentoria  extends Conteudo{

    LocalDate data;


    @Override
    public double calcularXp() {
        return XP_PADRAO + 20;
    }

    public Mentoria() {
    }

     public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria == " +
                 getTitulo() +
                "|| Descricao == " + getDescricao() +
                "|| Data Inicial == " + data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))+
                '\n';
    }

}