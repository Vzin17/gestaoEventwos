package br.edu.unisep.eventwos.util;

import br.edu.unisep.eventwos.model.*;

import javax.swing.*;
import java.util.ArrayList;

public class Funcoes {

    private ArrayList<Evento> eventos = new ArrayList<>();
    private ArrayList<Sessao> sessoes = new ArrayList<>();
    private ArrayList<Palestrante> palestrantes = new ArrayList<>();
    private ArrayList<Inscricao> inscricoes = new ArrayList<>();
    private ArrayList<Participante> participantes = new ArrayList<>();


    public void novoEvento() {
        Evento evento = new Evento();
        int id = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID: "));
        String local = JOptionPane.showInputDialog("Digite o Local: ");
        String nome = JOptionPane.showInputDialog("Digite o nome do Evento: ");
        String sessao = JOptionPane.showInputDialog("Digite as sessões disponíveis: ");
        String dataInicio = JOptionPane.showInputDialog("Que dia vai começar: ");
        String dataFim = JOptionPane.showInputDialog("Que dia vai terminar: ");

        evento.setId(id);
        evento.setLocal(local);
        evento.setNome(nome);
        evento.setSessao(sessao);
        evento.setDataInicio(dataInicio);
        evento.setDataFim(dataFim);

        eventos.add(evento);
    }


    public void novaSessao() {
        Sessao sessao = new Sessao();
        int id = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID: "));
        String nome = JOptionPane.showInputDialog("Digite o nome da sessão: ");

        sessao.setId(id);
        sessao.setNome(nome);

        sessoes.add(sessao);
    }


    public void novoPalestrante() {
        Palestrante palestrante = new Palestrante();
        String nome = JOptionPane.showInputDialog("Digite o nome do palestrante: ");
        palestrante.setNome(nome);
        palestrantes.add(palestrante);
    }


    public void novaInscricao() {
        Inscricao inscricao = new Inscricao();
        int id = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID da inscrição: "));
        inscricao.setIdInscricao(id);
        inscricoes.add(inscricao);
    }


    public void novoParticipante() {
        Participante participante = new Participante();
        String nome = JOptionPane.showInputDialog("Digite o nome do participante: ");
        participante.setNome(nome);
        participantes.add(participante);
    }


    public void listarEventos() {
        StringBuilder lista = new StringBuilder("Eventos:\n");
        for (Evento evento : eventos) {
            lista.append("ID: ").append(evento.getIdEvento())
                    .append(", Nome: ").append(evento.getNome())
                    .append(", Local: ").append(evento.getLocal()).append("\n");
        }
        JOptionPane.showMessageDialog(null, lista.toString());
    }


    public boolean escolherOpcao() {
        String[] opcoes = {
                "Adicionar Evento",
                "Adicionar Sessão",
                "Adicionar Inscrição",
                "Adicionar Participante",
                "Adicionar Palestrante",
                "Listar Evento",
                "Sair"
        };

        int opcaoEscolhida = JOptionPane.showOptionDialog(null,
                "Escolha uma Opção",
                "Menu principal",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                opcoes,
                opcoes[0]);

        switch (opcaoEscolhida) {
            case 0:
                novoEvento();
                break;
            case 1:
                novaSessao();
                break;
            case 2:
                novaInscricao();
                break;
            case 3:
                novoParticipante();
                break;
            case 4:
                novoPalestrante();
                break;
            case 5:
                listarEventos();
                break;
            case 6:
                return false;
        }
        return true;
    }
}
