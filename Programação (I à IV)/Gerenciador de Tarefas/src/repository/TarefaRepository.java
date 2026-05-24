package repository;
import model.Tarefa;
import java.util.ArrayList;
import java.util.List;
public class TarefaRepository implements ITarefaRepository {
    private List<Tarefa> lista = new ArrayList<>();
    public void salvar(Tarefa obj) { lista.add(obj); }
    public List<Tarefa> listar() { return lista; }
    public void deletar(int id) { lista.removeIf(x -> x.getId() == id); }
}