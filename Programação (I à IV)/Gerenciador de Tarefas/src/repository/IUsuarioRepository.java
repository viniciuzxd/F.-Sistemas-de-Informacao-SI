package repository;
import model.Usuario;
import java.util.List;
public interface IUsuarioRepository {
    void salvar(Usuario obj);
    List<Usuario> listar();
    void deletar(int id);
}