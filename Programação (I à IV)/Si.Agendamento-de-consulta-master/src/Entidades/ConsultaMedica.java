package Entidades;

public class ConsultaMedica extends Consulta{
    private String diagnostico;
    private String prescricao;

    public ConsultaMedica(int id, String data, String hora, Paciente paciente, String diagnostico, String prescricao) {
        super(id, data, hora, paciente);
        this.diagnostico = diagnostico;
        this.prescricao = prescricao;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public String getPrescricao() {
        return prescricao;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public void setPrescricao(String prescricao) {
        this.prescricao = prescricao;
    }

}
