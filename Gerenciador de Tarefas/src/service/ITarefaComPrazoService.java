package service;

import model.TarefaComPrazo;
import java.util.List;

public interface ITarefaComPrazoService {
    void salvar(TarefaComPrazo obj);
    List<TarefaComPrazo> listar();
    void deletar(int id);
}