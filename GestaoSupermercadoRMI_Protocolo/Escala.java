import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface Escala extends Remote {
    void registrarFuncionario(Funcionario f) throws RemoteException;
    List<Funcionario> listarFuncionarios() throws RemoteException;
}