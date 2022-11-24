public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("**********Bem Vindo ao Seu Banco**********");

        Cliente Jhonatan = new Cliente();
        Jhonatan.setNome("Jhonatan da Silva Mendes");
        Conta cc = new ContaCorrente(Jhonatan);
        Conta cp = new ContaPoupanca(Jhonatan);

        cc.depositar(100);
        cc.transferir(100, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();


    }
}
