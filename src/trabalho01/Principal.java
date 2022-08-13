package trabalho01;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		ArrayList<Cliente> listaCliente = new ArrayList<>();
		
		System.out.println("Deseja adicionar um cliente? S ou N?");
		
		Character opt = input.next().charAt(0);
		input.nextLine();
				
		while(Character.toLowerCase(opt) != 'n') {
			
			try {
				System.out.println("Novo cliente\n");
				System.out.print("CPF: ");
				String cpf = input.nextLine();
	
				System.out.print("Data de nascimento: ");
				Integer anoNasc = input.nextInt();
				
				input.nextLine();
				
				System.out.print("Nome: ");
				String nome = input.nextLine();
				
				System.out.print("Email: ");
				String email = input.nextLine();
				
				Cliente cliente = new Cliente(cpf, anoNasc, nome, email);
				listaCliente.add(cliente);
				
				System.out.println("Deseja adicionar um cliente?");
				opt = input.next().charAt(0);
				input.nextLine();
			} catch (InputMismatchException error) {
				System.out.println("Erro, dados inseridos incorretamente!\n");
			} catch(Exception error) {
				System.err.println(error);
			}		
		}
		
		for (Cliente cliente : listaCliente) {
			System.out.println(cliente.toString());
		}
		
		input.close();
		
	}
}