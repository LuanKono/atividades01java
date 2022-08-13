package main;

import javax.swing.JOptionPane;

public class Cliente {
	
	private String cpf;
	private int anoNascimento;
	private String nome;
	private String email;
	
	public Cliente() {
		//DEFAULT CONSTRUCTOR
	}
	
	public Cliente(String putCPF, String putNome, String putEmail, int putAnoNasc) {
		
		this.cpf = putCPF;
		this.anoNascimento = putAnoNasc;
		this.nome = putNome;
		this.email = putEmail;
		
	};
		
	public String getCPF(){
		return this.cpf;
	};
	
	public void setCPF(String putCPF){
		this.cpf = putCPF;
	};
	
	public int getAnoNascimento(){
		return this.anoNascimento;
	};
	
	public void setAnoNascimento(int putAnoNasc){
		this.anoNascimento = putAnoNasc;
	};
	
	public String getNome(){
		return this.nome;
	};
	
	public void setNome(String putNome){
		this.nome = putNome;
	};
	
	public String getEmail(){
		return this.email;
	};
	
	public void setEmail(String putEmail){
		this.email = putEmail;
	};
	
	public void mostraClienteJoption() {
		JOptionPane.showMessageDialog(null, "Cliente" + "\n" + "Nome: " + this.getNome() + "\n" + "CPF: " + this.getCPF() + "\n" + "EMAIL: " + this.getEmail() + "\n" + "DATA DE NASCIMENTO: " + this.getAnoNascimento());
	};

	@Override
	public String toString(){	
		return "Cliente" + "\n" + "Nome: " + this.nome + "\n" + "CPF: " + this.cpf + "\n" + "EMAIL: " + this.email + "\n" + "DATA DE NASCIMENTO: " + this.anoNascimento;
	};
};
