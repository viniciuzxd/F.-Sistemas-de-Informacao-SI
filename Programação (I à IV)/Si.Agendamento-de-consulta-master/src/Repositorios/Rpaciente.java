package Repositorios;

import Entidades.Paciente;
import java.util.ArrayList;
import Interfaces.Ipaciente;

public class Rpaciente implements Ipaciente{
    private ArrayList<Paciente> pacientes = new ArrayList<Paciente>();

    public void adicionarPaciente(Paciente paciente) {
        pacientes.add(paciente);
    }
    public void removerPaciente(Paciente paciente) {
        pacientes.remove(paciente);
    }

    public void buscarPacientePorCpf(String cpf) {
        for (Paciente paciente : pacientes) {
            if (paciente.getCpf().equals(cpf)) {
                System.out.println(paciente);
            }
        }
    }

    public void alterarPaciente(Paciente paciente) {
        for (Paciente pacienteAtual : pacientes) {
            if (pacienteAtual.getCpf().equals(paciente.getCpf())) {
                pacienteAtual = paciente;
            }
        }
    }

    public void listarPacientes() {
        for (Paciente paciente : pacientes) {
            System.out.println(paciente);
        }
    }
}
