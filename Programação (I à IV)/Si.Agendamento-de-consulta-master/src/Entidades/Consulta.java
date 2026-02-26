package Entidades;

public class Consulta{
    private int id;
    private String data;
    private String hora;
    private Paciente paciente;

    public Consulta(int id, String data, String hora, Paciente paciente) {
        this.id = id;
        this.data = data;
        this.hora = hora;
        this.paciente = paciente;
    }

    public int getId() {
        return id;
    }

    public String getData() {
        return data;
    }

    public String getHora() {
        return hora;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
}
