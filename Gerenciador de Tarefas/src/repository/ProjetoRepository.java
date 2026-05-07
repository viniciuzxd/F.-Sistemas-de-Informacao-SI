package repository;
import model.Projeto;
import java.util.ArrayList;
import java.util.List;
public class ProjetoRepository implements IProjetoRepository {
    private List<Projeto> lista = new ArrayList<>();
    public void salvar(Projeto obj) { lista.add(obj); }
    public List<Projeto> listar() { return lista; }
    public void deletar(int id) { lista.removeIf(x -> x.getId() == id); }
}