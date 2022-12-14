
    public class Conta implements Iconta {

    private static final int AGENCIA_PADRAO = 01;
    private static  int SEQUENCIAL = 1;

    protected int agencia;
    protected int numeroConta;
    protected double saldo;
    protected Cliente cliente;
    

    public Conta(Cliente cliente){
        this.agencia = AGENCIA_PADRAO;
        this.numeroConta = SEQUENCIAL++;
        this.cliente = cliente;
    }
    
    
    @Override
    public void sacar(double valor) {
       saldo -= valor;
        
    }
    @Override
    public void depositar(double valor) {
        saldo += valor;
        
    }
    @Override
    public void transferir(double valor, Conta contaDestino) {
       this.sacar(valor);
       contaDestino.depositar(valor);
        
    }
    
    public int getAgencia(){
        return agencia;
    }
    public int getnumeroConta(){
        return numeroConta;

    }
    public double getsaldo(){
        return saldo;
    }


    
    @Override
    public void imprimirExtrato() {        
        imprimirInfosComuns();
        
    }


    /**
     * 
     */
    protected void imprimirInfosComuns() {
        System.out.println(String.format("Titular: %s ", cliente.getNome()));
        System.out.println(String.format("Agencia: %d", agencia));
        System.out.println(String.format("Numero %d", numeroConta));
        System.out.println(String.format("Saldo: %2f", saldo));
        // TODO Auto-generated method stub
    }

    }
    

