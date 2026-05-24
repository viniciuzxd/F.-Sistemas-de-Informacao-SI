package repository;
import model.Tarefa;
import java.util.List;
public interface ITarefaRepository {
    void salvar(Tarefa obj);
    List<Tarefa> listar();
    void deletar(int id);
}