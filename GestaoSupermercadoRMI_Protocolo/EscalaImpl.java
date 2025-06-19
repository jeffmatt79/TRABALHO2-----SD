import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

public class EscalaImpl extends UnicastRemoteObject implements Escala {
    private List<Funcionario> funcionarios;

    public EscalaImpl() throws RemoteException {
        funcionarios = new ArrayList<>();
    }

    public void registrarFuncionario(Funcionario f) {
        funcionarios.add(f);
    }

    public List<Funcionario> listarFuncionarios() {
        return funcionarios;
    }
}