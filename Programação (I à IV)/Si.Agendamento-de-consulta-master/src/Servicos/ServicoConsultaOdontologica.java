package Servicos;

import Entidades.ConsultaOdontologica;
import Repositorios.RconsultaOdontologica;
import java.util.ArrayList;

public class ServicoConsultaOdontologica {
    private RconsultaOdontologica rConsultaOdontologica = new RconsultaOdontologica();

    public ServicoConsultaOdontologica(RconsultaOdontologica rConsultaOdontologica) {
        this.rConsultaOdontologica = rConsultaOdontologica;
    }

    public void adicionarConsultaOdontologica(ConsultaOdontologica consultaOdontologica) {
        rConsultaOdontologica.adicionarConsultaOdontologica(consultaOdontologica);
    }

    public void removerConsultaOdontologica(ConsultaOdontologica consultaOdontologica) {
        rConsultaOdontologica.removerConsultaOdontologica(consultaOdontologica);
    }

    public ConsultaOdontologica buscarConsultaOdontologicaPorId(int id) {
        return rConsultaOdontologica.buscarConsultaOdontologicaPorId(id);
    }

    public void alterarConsultaOdontologica(ConsultaOdontologica consultaOdontologica) {
        rConsultaOdontologica.alterarConsultaOdontologica(consultaOdontologica);
    }

    public ArrayList<ConsultaOdontologica> listarConsultasOdontologicas() {
        return rConsultaOdontologica.listarConsultasOdontologicas();
    }
}

