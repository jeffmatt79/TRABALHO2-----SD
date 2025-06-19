import java.util.Scanner;
import com.google.gson.Gson;
import java.rmi.Naming;


public class ClientMain {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Gson gson = new Gson();

        ProtocoloRemoto protocolo = (ProtocoloRemoto) Naming.lookup("rmi://localhost/ProtocoloService");

        while (true) {
            System.out.println("\n1 - Registrar funcionário");
            System.out.println("2 - Listar funcionários");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            int op = Integer.parseInt(sc.nextLine());

            if (op == 0) break;

            if (op == 1) {
                System.out.print("Nome: ");
                String nome = sc.nextLine();
                System.out.print("ID: ");
                int id = Integer.parseInt(sc.nextLine());
                System.out.print("Tipo (Vendedor, Caixa, Balconista, Gerente): ");
                String tipo = sc.nextLine();

                Funcionario f;
                switch (tipo.toLowerCase()) {
                    case "vendedor": f = new Vendedor(nome, id); break;
                    case "caixa": f = new Caixa(nome, id); break;
                    case "balconista": f = new Balconista(nome, id); break;
                    case "gerente": f = new Gerente(nome, id); break;
                    default:
                        System.out.println("Tipo inválido.");
                        continue;
                }

                byte[] dados = gson.toJson(f).getBytes();
                byte[] resposta = protocolo.doOperation("Escala", "registrarFuncionario", dados);
                System.out.println("Resposta: " + new String(resposta));
            }

            if (op == 2) {
                byte[] resposta = protocolo.doOperation("Escala", "listarFuncionarios", new byte[0]);
                String json = new String(resposta);
                Funcionario[] lista = gson.fromJson(json, Funcionario[].class);
                for (Funcionario f : lista) {
                    System.out.println(f);
                }
            }
        }

        sc.close();
    }
}

