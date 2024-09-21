package br.edu.unisep.eventwos.model;


public class Palestrante {
    private int idPalestrante;
    private String nome;
    private String especialidade;


    public Palestrante() {
        this.idPalestrante = idPalestrante;
        this.nome = nome;
        this.especialidade = especialidade;
    }


    public int getIdPalestrante() {
        return idPalestrante;
    }

    public String getNome() {
        return nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
