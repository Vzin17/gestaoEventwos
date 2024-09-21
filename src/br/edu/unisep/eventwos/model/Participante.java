package br.edu.unisep.eventwos.model;


public class Participante {
    private int idParticipante;
    private String nome;
    private String email;


    public Participante() {
        this.idParticipante = idParticipante;
        this.nome = nome;
        this.email = email;
    }


    // Getters
    public int getIdParticipante() {
        return idParticipante;
    }

    public String getNome(String nome) {
        return this.nome;
    }

    public String getEmail() {
        return email;
    }

    public void setNome(String nome) {
    }
}

