package Entidades;

public class ConsultaOdontologica extends Consulta{
    private String procedimento;
    private String dentista;

    public ConsultaOdontologica(int id, String data, String hora, Paciente paciente, String procedimento, String dentista) {
        super(id, data, hora, paciente);
        this.procedimento = procedimento;
        this.dentista = dentista;
    }

    public String getProcedimento() {
        return procedimento;
    }

    public String getDentista() {
        return dentista;
    }

    public void setProcedimento(String procedimento) {
        this.procedimento = procedimento;
    }

    public void setDentista(String dentista) {
        this.dentista = dentista;
    }
}
