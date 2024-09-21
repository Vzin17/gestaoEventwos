package br.edu.unisep.eventwos.model;


public class Inscricao {
    private int idInscricao;
    private Participante participante;
    private Sessao sessao;

    // Construtor
    public Inscricao() {
        this.idInscricao = idInscricao;
        this.participante = participante;
        this.sessao = sessao;
    }

    // Getters
    public int getIdInscricao() {
        return idInscricao;
    }

    public Participante getParticipante() {
        return participante;
    }

    public Sessao getSessao() {
        return sessao;
    }

    public void setIdInscricao(int idInscricao) {
        this.idInscricao = idInscricao;
    }
}
