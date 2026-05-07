package service;

import model.Projeto;
import repository.IProjetoRepository;
import java.util.List;

public class ProjetoService implements IProjetoService {
    private IProjetoRepository repo;

    public ProjetoService(IProjetoRepository repo) {
        this.repo = repo;
    }

    @Override
    public void salvar(Projeto obj) {
        repo.salvar(obj);
    }

    @Override
    public List<Projeto> listar() {
        return repo.listar();
    }

    @Override
    public void deletar(int id) {
        repo.deletar(id);
    }
}