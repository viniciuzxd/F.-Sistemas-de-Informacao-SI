package repository;
import model.TarefaComPrazo;
import java.util.List;
public interface ITarefaComPrazoRepository {
    void salvar(TarefaComPrazo obj);
    List<TarefaComPrazo> listar();
    void deletar(int id);
}