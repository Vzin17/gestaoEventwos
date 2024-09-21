package br.edu.unisep.eventwos.model;


import java.util.ArrayList;
import java.util.List;

public class Evento {
    private int idEvento;
    private String sessao;
    private String nome;
    private String dataInicio;
    private String dataFim;
    private String local;
    private List<Sessao> sessoes;


    public Evento() {
        this.idEvento = idEvento;
        this.nome = nome;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.local = local;
        this.sessoes = new ArrayList<>();
    }


    public void adicionarSessao(Sessao sessao) {
        this.sessoes.add(sessao);
    }


    public int getIdEvento() {
        return idEvento;
    }

    public String getNome() {
        return nome;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public String getDataFim() {
        return dataFim;
    }

    public String getLocal() {
        return local;
    }

    public List<Sessao> getSessoes() {
        return sessoes;
    }

    public void setId(int id) {
        this.idEvento = id;
    }

    public int getId() {
        return idEvento;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSessao(String sessao) {
        this.sessao = sessao;
    }

    public String getSessao() {
        return sessao.toString();
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }
}
