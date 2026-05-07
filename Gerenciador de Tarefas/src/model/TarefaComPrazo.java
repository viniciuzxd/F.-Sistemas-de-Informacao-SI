package model;

public class TarefaComPrazo extends Tarefa {
    private String prazo;

    public TarefaComPrazo() {}
    public TarefaComPrazo(int id, String descricao, String prazo) {
        super(id, descricao);
        this.prazo = prazo;
    }

    public String getPrazo() { return prazo; }
    public void setPrazo(String prazo) { this.prazo = prazo; }
}