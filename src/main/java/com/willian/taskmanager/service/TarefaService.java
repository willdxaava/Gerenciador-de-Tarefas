package com.willian.taskmanager.service;

import com.willian.taskmanager.model.Tarefa;
import java.util.ArrayList;
import java.util.List;

public class TarefaService implements ITarefaService {

    private List<Tarefa> tarefas = new ArrayList<>();

    @Override
    public void adicionarTarefa(String titulo) {
        tarefas.add(new Tarefa(titulo));
    }

    @Override
    public void listarTarefas() {
        if (tarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa.");
            return;
        }

        for (int i = 0; i < tarefas.size(); i++) {
            System.out.println(i + " - " + tarefas.get(i));
        }
    }

    @Override
    public void concluirTarefa(int indice) {
        if (indice >= 0 && indice < tarefas.size()) {
            tarefas.get(indice).concluir();
        } else {
            System.out.println("Índice inválido");
        }
    }

    @Override
    public void removerTarefa(int indice) {
        if (indice >= 0 && indice < tarefas.size()) {
            tarefas.remove(indice);
        } else {
            System.out.println("Índice inválido");
        }
    }
}