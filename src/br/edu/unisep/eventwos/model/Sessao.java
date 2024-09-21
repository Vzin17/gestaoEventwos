package br.edu.unisep.eventwos.model;


import java.util.ArrayList;
import java.util.List;

public class Sessao {
    private int idSessao;
    private String nome;
    private String horario;
    private List<Palestrante> palestrantes;


    public Sessao() {
        this.idSessao = idSessao;
        this.nome = nome;
        this.horario = horario;
        this.palestrantes = new ArrayList<>();
    }


    public void adicionarPalestrante(Palestrante palestrante) {
        this.palestrantes.add(palestrante);
    }


    public int getIdSessao() {
        return idSessao;
    }

    public String getNome() {
        return nome;
    }

    public String getHorario() {
        return horario;
    }

    public List<Palestrante> getPalestrantes() {
        return palestrantes;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setId(int id) {
        this.idSessao = id;
    }

    public int getId() {
        return idSessao;
    }

    private class Palestrante {
    }
}
