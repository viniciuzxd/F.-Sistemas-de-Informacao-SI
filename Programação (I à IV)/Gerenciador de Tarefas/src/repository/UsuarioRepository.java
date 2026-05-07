package repository;
import model.Usuario;
import java.util.ArrayList;
import java.util.List;
public class UsuarioRepository implements IUsuarioRepository {
    private List<Usuario> lista = new ArrayList<>();
    public void salvar(Usuario obj) { lista.add(obj); }
    public List<Usuario> listar() { return lista; }
    public void deletar(int id) { lista.removeIf(x -> x.getId() == id); }
}