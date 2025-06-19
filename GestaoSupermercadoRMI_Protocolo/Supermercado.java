import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Supermercado implements Serializable {
    private List<Funcionario> funcionarios = new ArrayList<>();

    public void adicionarFuncionario(Funcionario f) {
        funcionarios.add(f);
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }
}