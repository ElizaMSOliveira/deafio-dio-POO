package br.com.dio.desafio.dominio;
//Abastratic não consegu instanicar e so as classes filhas vão usar.
public abstract class Conteudo {
    //FINAL = Uma constante. Statico = poder acesssar fora da classe;
    protected static final double XP_PADRAO = 10d;

    private String titulo;
    private String descricao;

    public abstract double calcularXp();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String tirulo) {
        this.titulo = tirulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
