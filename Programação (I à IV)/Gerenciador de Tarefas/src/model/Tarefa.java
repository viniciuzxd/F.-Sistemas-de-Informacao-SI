package model;

public class Tarefa {
    private int id;
    private String descricao;

    public Tarefa() {}
    public Tarefa(int id) { this.id = id; }
    public Tarefa(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
}