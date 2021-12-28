import java.util.ArrayList;
import java.util.List;

public class Banco {

    public String nome;
    List<Cliente> clientes;

    public Banco() {
        this.nome = "Banco Digital";
        clientes = new ArrayList<Cliente>();
    }

    public void inserirCliente(Cliente cliente) {
        this.clientes.add(cliente);
    }
    
    public void listaTodosClientes() {
        clientes.forEach(System.out::println);
    }
    
    
}
