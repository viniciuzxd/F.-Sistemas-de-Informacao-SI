package Repositorios;

import java.util.ArrayList;
import Entidades.ConsultaOdontologica;
import Interfaces.IconsultaOdontologica;
public class RconsultaOdontologica implements  IconsultaOdontologica{
    private ArrayList<ConsultaOdontologica> consultasOdontologicas = new ArrayList<ConsultaOdontologica>();

    public void adicionarConsultaOdontologica(ConsultaOdontologica consultaOdontologica) {
        consultasOdontologicas.add(consultaOdontologica);
    }
    public void removerConsultaOdontologica(ConsultaOdontologica consultaOdontologica) {
        consultasOdontologicas.remove(consultaOdontologica);
    }

    public ConsultaOdontologica buscarConsultaOdontologicaPorId(int id) {
        for (ConsultaOdontologica consultaOdontologica : consultasOdontologicas) {
            if (consultaOdontologica.getId() == id) {
                return consultaOdontologica;
            }
        }
        return null;
    }

    public void alterarConsultaOdontologica(ConsultaOdontologica consultaOdontologica) {
        for (ConsultaOdontologica consultaOdontologicaAtual : consultasOdontologicas) {
            if (consultaOdontologicaAtual.getId() == consultaOdontologica.getId()) {
                consultaOdontologicaAtual = consultaOdontologica;
            }
        }
    }

    public ArrayList<ConsultaOdontologica> listarConsultasOdontologicas() {
        return consultasOdontologicas;
    }

}
