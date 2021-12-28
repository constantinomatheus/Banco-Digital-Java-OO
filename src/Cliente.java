import java.util.ArrayList;
import java.util.List;

public class Cliente {
    
    protected int ID;
    public String nome;
    List<Conta> contas;

    private static int CONTADOR_ID = 1;

    public Cliente(String nome) {
        this.ID = CONTADOR_ID++;
        this.nome = nome;
        contas = new ArrayList<Conta>();
        System.out.println("Cliente " + this.nome + " cadastrado");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void listarContas() {
        contas.forEach(System.out::println);
    }

    public void setConta(Conta conta) {
        contas.add(conta);
    }

    @Override
    public String toString() {
        return "Cliente [ID=" + ID + ", contas=" + contas + ", nome=" + nome + "]";
    }

    public void dadosCliente() {
        String dados = "";
        dados += "Cliente: " + this.nome;
        dados += getContas();
        System.out.println(dados);
    }

    public int getID() {
        return ID;
    }
}
