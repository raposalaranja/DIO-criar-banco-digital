package bancodigital;

//Um banco oferece aos seus clientes 2 tipos de contas (Conta corrente e conta Poupança),//
//as quais possuem as funcionalidades de depósito, saque e transferência (entre contas da própria Instituição).// 

import java.util.List;

public class Banco {
	 
	private String nome;
	private List<Conta> contas;
	
	public String getNome() {
		return nome;
		
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public List<Conta> getContas() {
		return contas;
	}
	
	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}
	}


