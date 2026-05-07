package service;

import model.TarefaSimples;
import repository.ITarefaSimplesRepository;
import java.util.List;

public class TarefaSimplesService implements ITarefaSimplesService {
    private ITarefaSimplesRepository repo;

    public TarefaSimplesService(ITarefaSimplesRepository repo) {
        this.repo = repo;
    }

    @Override
    public void salvar(TarefaSimples obj) {
        repo.salvar(obj);
    }

    @Override
    public List<TarefaSimples> listar() {
        return repo.listar();
    }

    @Override
    public void deletar(int id) {
        repo.deletar(id);
    }
}