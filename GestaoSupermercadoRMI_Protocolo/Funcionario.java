import java.io.Serializable;

public class Funcionario implements Serializable {
    protected String nome;
    protected int id;
    protected String tipo;

    public Funcionario(String nome, int id, String tipo) {
        this.nome = nome;
        this.id = id;
        this.tipo = tipo;
    }

    public String getNome() { return nome; }
    public int getId() { return id; }
    public String getTipo() { return tipo; }
    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", id=" + id +
                '}';
    }
}
