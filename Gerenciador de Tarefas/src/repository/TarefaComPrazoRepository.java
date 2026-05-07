package repository;
import model.TarefaComPrazo;
import java.util.ArrayList;
import java.util.List;
public class TarefaComPrazoRepository implements ITarefaComPrazoRepository {
    private List<TarefaComPrazo> lista = new ArrayList<>();
    public void salvar(TarefaComPrazo obj) { lista.add(obj); }
    public List<TarefaComPrazo> listar() { return lista; }
    public void deletar(int id) { lista.removeIf(x -> x.getId() == id); }
}