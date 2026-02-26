package Interfaces;

import Entidades.Paciente;
public interface Ipaciente {
    public void adicionarPaciente(Paciente paciente);
    public void removerPaciente(Paciente paciente);
    public void buscarPacientePorCpf(String cpf);
    public void alterarPaciente(Paciente paciente);
    public void listarPacientes();
}
