package service;

import model.Tarefa;
import repository.ITarefaRepository;
import java.util.List;

public class TarefaService implements ITarefaService {
    private ITarefaRepository repo;

    public TarefaService(ITarefaRepository repo) {
        this.repo = repo;
    }

    @Override
    public void salvar(Tarefa obj) {
        repo.salvar(obj);
    }

    @Override
    public List<Tarefa> listar() {
        return repo.listar();
    }

    @Override
    public void deletar(int id) {
        repo.deletar(id);
    }

    // Implementação das 3 sobrecargas
    @Override
    public Tarefa buscar(int id) {
        for(Tarefa t : repo.listar()) {
            if(t.getId() == id) return t;
        }
        return null;
    }

    @Override
    public Tarefa buscar(String descricao) {
        for(Tarefa t : repo.listar()) {
            if(t.getDescricao().equalsIgnoreCase(descricao)) return t;
        }
        return null;
    }

    @Override
    public Tarefa buscar(int id, String descricao) {
        Tarefa t = buscar(id);
        if(t != null && t.getDescricao().equalsIgnoreCase(descricao)) return t;
        return null;
    }
}