package Repositorios;

import java.util.ArrayList;
import Entidades.ConsultaMedica;
import Interfaces.IconsultaMedica;
public class RconsultaMedica implements IconsultaMedica{
    private ArrayList<ConsultaMedica> consultasMedicas = new ArrayList<ConsultaMedica>();

    public void adicionarConsultaMedica(ConsultaMedica consultaMedica) {
        consultasMedicas.add(consultaMedica);
    }

    public void removerConsultaMedica(ConsultaMedica consultaMedica) {
        consultasMedicas.remove(consultaMedica);
    }

    public void buscarConsultaMedicaPorId(int id) {
        for (ConsultaMedica consultaMedica : consultasMedicas) {
            if (consultaMedica.getId() == id) {
                System.out.println(consultaMedica);
            }
        }
    }

    public void alterarConsultaMedica(ConsultaMedica consultaMedica) {
        for (ConsultaMedica consultaMedicaAtual : consultasMedicas) {
            if (consultaMedicaAtual.getId() == consultaMedica.getId()) {
                consultaMedicaAtual = consultaMedica;
            }
        }
    }

    public void listarConsultasMedicas() {
        for (ConsultaMedica consultaMedica : consultasMedicas) {
            System.out.println(consultaMedica);
        }
    }
}
