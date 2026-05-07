package repository;
import model.Projeto;
import java.util.List;
public interface IProjetoRepository {
    void salvar(Projeto obj);
    List<Projeto> listar();
    void deletar(int id);
}