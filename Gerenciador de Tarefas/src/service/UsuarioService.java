package service;

import model.Usuario;
import repository.IUsuarioRepository;
import java.util.List;

public class UsuarioService implements IUsuarioService {
    private IUsuarioRepository repo;

    public UsuarioService(IUsuarioRepository repo) {
        this.repo = repo;
    }

    @Override
    public void salvar(Usuario obj) {
        repo.salvar(obj);
    }

    @Override
    public List<Usuario> listar() {
        return repo.listar();
    }

    @Override
    public void deletar(int id) {
        repo.deletar(id);
    }
}