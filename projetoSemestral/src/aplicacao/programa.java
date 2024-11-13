package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Cliente;

public class programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Cliente> listaClientes = new ArrayList<>();

		System.out.println("Registro de clientes da TechSphere");
		System.out.println();
		System.out.println("Olá, BeautySphere!");
		System.out.println();
		System.out.println("Quantos clientes para essa semana?");
		System.out.println();
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println();
			System.out.println("Cliente #" + (i + 1) + ":");
			System.out.println("Nome:");
			sc.next();
			String nome = sc.nextLine();
			System.out.println("Serviço:");
			String servico = sc.nextLine();
			System.out.println("Horário:");
			int horario = sc.nextInt();
			listaClientes.add(new Cliente(nome, servico, horario));
		}

		System.out.println();
		System.out.println("Cronograma da semana:");
		System.out.println();

		for (int i = 0; i <= vetor.length; i++) {
			System.out.println(vetor[i][0]);
		}
	}
}