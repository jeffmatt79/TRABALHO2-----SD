import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class ServerMain {
    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(1099);
            ProtocoloRemotoImpl protocolo = new ProtocoloRemotoImpl();
            Naming.rebind("rmi://localhost/ProtocoloService", protocolo);
            System.out.println("Servidor RMI com protocolo iniciado.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}