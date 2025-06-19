import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class ProtocoloRemotoImpl extends UnicastRemoteObject implements ProtocoloRemoto {
    private EscalaImpl escala;
    private Gson gson = new Gson();

    public ProtocoloRemotoImpl() throws RemoteException {
        escala = new EscalaImpl();
    }

    public byte[] doOperation(String objectRef, String methodId, byte[] arguments) throws RemoteException {
        try {
            String jsonArgs = new String(arguments);
            switch (methodId) {
                case "registrarFuncionario":
                    Funcionario f = gson.fromJson(jsonArgs, Funcionario.class);
                    escala.registrarFuncionario(f);
                    return "OK".getBytes();

                case "listarFuncionarios":
                    List<Funcionario> lista = escala.listarFuncionarios();
                    String json = gson.toJson(lista);
                    return json.getBytes();

                default:
                    return "Método não reconhecido".getBytes();
            }
        } catch (Exception e) {
            return ("Erro: " + e.getMessage()).getBytes();
        }
    }
}