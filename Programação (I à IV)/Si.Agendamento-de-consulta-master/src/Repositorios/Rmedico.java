package Repositorios;

import Entidades.Medico;
import java.util.ArrayList;
import Interfaces.Imedico;
public class Rmedico implements Imedico{
    private ArrayList<Medico> medicos = new ArrayList<Medico>();

    public void adicionarMedico(Medico medico) {
        medicos.add(medico);
    }
    public void removerMedico(Medico medico) {
        medicos.remove(medico);
    }

    public void buscarMedicoPorCrm(String crm) {
        for (Medico medico : medicos) {
            if (medico.getCrm().equals(crm)) {
                System.out.println(medico);
            }
        }
    }

    public void alterarMedico(Medico medico) {
        for (Medico medicoAtual : medicos) {
            if (medicoAtual.getCrm().equals(medico.getCrm())) {
                medicoAtual = medico;
            }
        }
    }

    public void listarMedicos() {
        for (Medico medico : medicos) {
            System.out.println(medico);
        }
    }
}
