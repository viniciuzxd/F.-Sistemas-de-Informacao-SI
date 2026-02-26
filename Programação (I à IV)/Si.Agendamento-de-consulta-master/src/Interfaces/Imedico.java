package Interfaces;

import Entidades.Medico;
public interface Imedico {
    public void adicionarMedico(Medico medico);
    public void removerMedico(Medico medico);
    public void buscarMedicoPorCrm(String crm);
    public void alterarMedico(Medico medico);
    public void listarMedicos();
}
