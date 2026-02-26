package Interfaces;
import Entidades.ConsultaMedica;
import java.util.ArrayList;

public interface IconsultaMedica {
    public void adicionarConsultaMedica(ConsultaMedica consultaMedica);
    public void removerConsultaMedica(ConsultaMedica consultaMedica);
    public void buscarConsultaMedicaPorId(int id);
    public void alterarConsultaMedica(ConsultaMedica consultaMedica);
    public void listarConsultasMedicas();
}
