package service;

import model.Projeto;
import java.util.List;

public interface IProjetoService {
    void salvar(Projeto obj);
    List<Projeto> listar();
    void deletar(int id);
}