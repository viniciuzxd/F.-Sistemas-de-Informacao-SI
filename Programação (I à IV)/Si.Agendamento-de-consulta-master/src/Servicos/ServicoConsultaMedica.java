package Servicos;

import Entidades.ConsultaMedica;
import Repositorios.RconsultaMedica;
import Interfaces.IservicoConsultaMedica;
public class ServicoConsultaMedica implements IservicoConsultaMedica {
    private RconsultaMedica rConsultaMedica = new RconsultaMedica();

    public ServicoConsultaMedica(RconsultaMedica rConsultaMedica) {
        this.rConsultaMedica = rConsultaMedica;
    }

    public void adicionarConsultaMedica(ConsultaMedica consultaMedica) {
        rConsultaMedica.adicionarConsultaMedica(consultaMedica);
    }

    public void removerConsultaMedica(ConsultaMedica consultaMedica) {
        rConsultaMedica.removerConsultaMedica(consultaMedica);
    }

    public void buscarConsultaMedicaPorId(int id) {
        rConsultaMedica.buscarConsultaMedicaPorId(id);
    }

    public void alterarConsultaMedica(ConsultaMedica consultaMedica) {
        rConsultaMedica.alterarConsultaMedica(consultaMedica);
    }

    public void listarConsultasMedicas() {
        rConsultaMedica.listarConsultasMedicas();
    }
}
