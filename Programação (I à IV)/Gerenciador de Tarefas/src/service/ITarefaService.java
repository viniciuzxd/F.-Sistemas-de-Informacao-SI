package service;

import model.Tarefa;
import java.util.List;

public interface ITarefaService {
    void salvar(Tarefa obj);
    List<Tarefa> listar();
    void deletar(int id);

    // As 3 sobrecargas exigidas pelo projeto
    Tarefa buscar(int id);
    Tarefa buscar(String descricao);
    Tarefa buscar(int id, String descricao);
}