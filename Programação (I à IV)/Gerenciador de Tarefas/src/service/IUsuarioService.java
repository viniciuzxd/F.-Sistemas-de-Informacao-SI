package service;

import model.Usuario;
import java.util.List;

public interface IUsuarioService {
    void salvar(Usuario obj);
    List<Usuario> listar();
    void deletar(int id);
}