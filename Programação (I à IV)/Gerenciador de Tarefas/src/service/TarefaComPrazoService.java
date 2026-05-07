package service;

import model.TarefaComPrazo;
import repository.ITarefaComPrazoRepository;
import java.util.List;

public class TarefaComPrazoService implements ITarefaComPrazoService {
    private ITarefaComPrazoRepository repo;

    public TarefaComPrazoService(ITarefaComPrazoRepository repo) {
        this.repo = repo;
    }

    @Override
    public void salvar(TarefaComPrazo obj) {
        repo.salvar(obj);
    }

    @Override
    public List<TarefaComPrazo> listar() {
        return repo.listar();
    }

    @Override
    public void deletar(int id) {
        repo.deletar(id);
    }
}