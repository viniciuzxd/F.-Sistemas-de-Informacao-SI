package repository;
import model.TarefaSimples;
import java.util.ArrayList;
import java.util.List;
public class TarefaSimplesRepository implements ITarefaSimplesRepository {
    private List<TarefaSimples> lista = new ArrayList<>();
    public void salvar(TarefaSimples obj) { lista.add(obj); }
    public List<TarefaSimples> listar() { return lista; }
    public void deletar(int id) { lista.removeIf(x -> x.getId() == id); }
}