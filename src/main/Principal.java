package main;

import java.util.Scanner;

public class Principal {
	public static void main(String[] Args){
		
		Scanner input = new Scanner(System.in);
		
		//CLIENTE 01
		
		System.out.println("\nInsira os dados do cliente 01\n");
		
		Cliente cliente01 = new Cliente();
		
		System.out.println("Nome: ");
		cliente01.setNome(input.nextLine());
		
		System.out.println("Email: ");
		cliente01.setEmail(input.nextLine());
		
		System.out.println("CPF: ");
		cliente01.setCPF(input.nextLine());
		
		System.out.println("Nascimento: ");
		cliente01.setAnoNascimento(input.nextInt());
		
		input.nextLine();
		
		//CLIENTE 02
		
		System.out.println("\nInsira os dados ddo cliente 02\n");
				
		System.out.println("Nome: ");
		String nome = input.nextLine();
		
		System.out.println("Email: ");
		String email = input.nextLine();
		
		System.out.println("CPF: ");
		String cpf = input.nextLine();
		
		System.out.println("Nascimento: ");
		Integer nasc = input.nextInt();
		
		input.nextLine();
		
		Cliente cliente02 = new Cliente(nome, email, cpf, nasc);
		
		//CONTA
		
		Conta conta01 = new Conta();
		
		System.out.println("\nInsira os dados da conta 01:");
		
		System.out.println("Numero da conta:");
		conta01.setNumero(input.nextInt());
		
		System.out.println("Saldo inicial:");
		conta01.setSaldo(input.nextFloat());
						
		System.out.println("Debitar na conta");
		conta01.debitaSaldo(input.nextFloat());
		
		System.out.println("Creditar na conta: ");
		conta01.creditaSaldo(input.nextFloat());
				
		input.nextLine();
		
		//CONTA 02
		
		System.out.println("\n\nInsira os dados da conta 02:");
		
		System.out.println("Numero da conta: ");
		Integer numero = input.nextInt();
		
		System.out.println("Saldo inicial: ");
		Float saldo = input.nextFloat();
		
		System.out.println("Debitar na conta");
		Float debita = input.nextFloat();
		saldo = saldo + debita;
		
		System.out.println("Debitar na conta");
		Float credita = input.nextFloat();
		saldo = saldo + credita;
		
		input.nextLine();
		
		Conta conta02 = new Conta(numero, saldo);
		
		//DADOS EXIBIDOS
		
		System.out.println("CLIENTE 01");
		System.out.println(cliente01.toString());
		System.out.println(conta01.toString());
		
		System.out.println("CLIENTE 02");
		System.out.println(cliente02.toString());
		System.out.println(conta02.toString());
			
		input.close();
	}
}
