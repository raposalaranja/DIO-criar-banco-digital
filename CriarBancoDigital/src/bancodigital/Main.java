package bancodigital;

public class Main {
	
	public static void main(String[] args) {
		Cliente snoopy = new Cliente();
		snoopy.setNome("Snoopy");
		
		
		
		Conta cc = new ContaCorrente(snoopy);
		Conta poupanca = new ContaPoupanca(snoopy);
		
		cc.depositar(200);		
		cc.transferir(200, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

}
}
