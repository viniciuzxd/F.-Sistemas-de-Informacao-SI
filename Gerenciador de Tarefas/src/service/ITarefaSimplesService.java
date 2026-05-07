package service;

import model.TarefaSimples;
import java.util.List;

public interface ITarefaSimplesService {
    void salvar(TarefaSimples obj);
    List<TarefaSimples> listar();
    void deletar(int id);
}