public abstract class Conta implements IConta {

    protected int agencia;
    protected int numero;
    protected double saldo;
    private TipoConta tipoConta;

    protected static int AGENCIA_PADRAO = 1;
    protected static int NUMERO_PADRAO = 1;

    public Conta() {
        this.agencia = AGENCIA_PADRAO++;
        this.numero = NUMERO_PADRAO++;
        this.saldo = 0;
    }

    public TipoConta getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(TipoConta tipoConta) {
        this.tipoConta = tipoConta;
    }

    public int getAgencia() {
        return agencia;
    }


    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean temSaldo() {
        return (this.getSaldo() >= 0);
    }
    
    public boolean temSaldo(double valor) {
        return ((getSaldo() - valor) >= 0);
    }   

    @Override
    public void sacar(double valor) {
        if(temSaldo(valor))
            this.saldo -= valor;
        else
            System.out.println("Saldo insuficiente.");
        
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
        
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        if(temSaldo(valor)) {
            sacar(valor);
            contaDestino.depositar(valor);
        }
    }

    @Override
    public void imprimirExtrato() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Conta [agencia=" + agencia + ", numero=" + numero + ", saldo=" + saldo + ", tipoConta=" + tipoConta
                + "]";
    }


    
}
