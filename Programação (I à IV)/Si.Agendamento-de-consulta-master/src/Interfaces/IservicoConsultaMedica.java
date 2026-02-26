package Interfaces;

import Entidades.ConsultaMedica;
public interface IservicoConsultaMedica {
    public void adicionarConsultaMedica(ConsultaMedica consultaMedica);
    public void removerConsultaMedica(ConsultaMedica consultaMedica);
    public void buscarConsultaMedicaPorId(int id);
    public void alterarConsultaMedica(ConsultaMedica consultaMedica);
    public void listarConsultasMedicas();
}
