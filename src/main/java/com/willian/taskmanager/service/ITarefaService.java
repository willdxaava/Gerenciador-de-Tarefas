package com.willian.taskmanager.service;

public interface ITarefaService {

    void adicionarTarefa(String titulo);
    void listarTarefas();
    void concluirTarefa(int indice);
    void removerTarefa(int indice);
}