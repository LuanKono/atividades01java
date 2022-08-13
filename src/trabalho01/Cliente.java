package trabalho01;

public class Cliente {
	
	private String cpf;
	private Integer anoNascimento;
	private String nome;
	private String email;
	
	public Cliente(String newCpf, Integer newAnoNascimento, String newNome, String newEmail) {
		this.cpf = newCpf;
		this.anoNascimento = newAnoNascimento;
		this.nome = newNome;
		this.email = newEmail;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
		
	public Integer getAnoNascimento() {
		return this.anoNascimento;
	}
	public void setAnoNascimento(Integer anoNascimento) {
		this.anoNascimento = anoNascimento;
	}
			
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
		
	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Cliente\n" + "\n" + "Nome: " + this.nome + "\n" + "CPF: " + this.cpf + "\n" + "EMAIL: " + this.email + "\n" + "DATA DE NASCIMENTO: " + this.anoNascimento + "\n\n---------------------\n";
	}
}
