package model;

public class TarefaSimples extends Tarefa {
    private String anotacao;

    public TarefaSimples() {}
    public TarefaSimples(int id, String descricao, String anotacao) {
        super(id, descricao);
        this.anotacao = anotacao;
    }

    public String getAnotacao() { return anotacao; }
    public void setAnotacao(String anotacao) { this.anotacao = anotacao; }
}