package Interfaces;

import Entidades.ConsultaOdontologica;
import java.util.ArrayList;
public interface IconsultaOdontologica {
    public void adicionarConsultaOdontologica(ConsultaOdontologica consultaOdontologica);
    public void removerConsultaOdontologica(ConsultaOdontologica consultaOdontologica);
    public ConsultaOdontologica buscarConsultaOdontologicaPorId(int id);
    public void alterarConsultaOdontologica(ConsultaOdontologica consultaOdontologica);
    public ArrayList<ConsultaOdontologica> listarConsultasOdontologicas();
}
