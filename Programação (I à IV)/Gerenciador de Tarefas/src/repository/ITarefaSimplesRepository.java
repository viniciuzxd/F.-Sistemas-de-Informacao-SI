package repository;
import model.TarefaSimples;
import java.util.List;
public interface ITarefaSimplesRepository {
    void salvar(TarefaSimples obj);
    List<TarefaSimples> listar();
    void deletar(int id);
}