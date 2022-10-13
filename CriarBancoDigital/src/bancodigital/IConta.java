package bancodigital;

public interface IConta {
	
    void sacar(double valor);
	
	void depositar(double valor);		
	
	void transferir(double balor, Conta contaDestino);
	
	void imprimirExtrato();
		
}


