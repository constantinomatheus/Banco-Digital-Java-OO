import java.util.Scanner;

public class Menu {
    public static void main(String[] args) throws Exception {
        System.out.println("Menu a ser implementado");
        // cadastrarCliente();
        Banco banco = new Banco();
        System.out.println("Criando dois clientes..");
        Cliente cliente1 = new Cliente("Cliente 1");
        Cliente cliente2 = new Cliente("Cliente 2");
        System.out.println("Criando três contas..");
        Conta conta1 = new ContaCorrente();
        Conta conta2 = new ContaCorrente();
        Conta conta3 = new ContaPoupanca();
        System.out.println("Associando clientes e contas..");
        cliente1.setConta(conta1);
        cliente1.setConta(conta3);
        cliente2.setConta(conta2);
        System.out.println("Associando clientes e banco..");
        banco.inserirCliente(cliente1);
        banco.inserirCliente(cliente2);
        System.out.println("Depositando 100 e transferindo 50 para poupança..");
        conta1.depositar(100);
        conta1.transferir(40,conta3);
        System.out.println("Listando todos clientes do banco..");
        banco.listaTodosClientes();
    }

    //TODO implementar funções para menu
    public static void cadastrarCliente() {
        System.out.print("Informe o nome do cliente: ");
        Scanner leitorNome = new Scanner(System.in);
        String nome = leitorNome.next();
        Cliente cliente = new Cliente(nome);
        cliente.dadosCliente();
        leitorNome.close();
    }
    
    public static void menu(int opcaoUsuario) {
        //TODO Adicionar menu para trabalhar com as classes Cliente, Conta, etc
    }
}
