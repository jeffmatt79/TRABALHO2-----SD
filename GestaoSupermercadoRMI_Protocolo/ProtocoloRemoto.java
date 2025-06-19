import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ProtocoloRemoto extends Remote {
    byte[] doOperation(String objectRef, String methodId, byte[] arguments) throws RemoteException;
}