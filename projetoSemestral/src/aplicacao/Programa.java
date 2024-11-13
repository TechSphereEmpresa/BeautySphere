package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Agenda;
import entidades.Cliente;
import entidades.Enumeradas.Dias;
import entidades.Enumeradas.Horas;
import entidades.Enumeradas.Servicos;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Agenda horarios = new Agenda();
		List<Cliente> listaClientes = new ArrayList<>();

		System.out.println("Registro de clientes da TechSphere");
		System.out.println();
		System.out.println("Olá, BeautySphere!");
		System.out.println();
		System.out.println("Quantos clientes para essa semana?");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println();
			System.out.println("Cliente #" + (i + 1) + ":");
			System.out.println("Nome:");
			sc.next();
			String nome = sc.nextLine();
			
			System.out.println("Serviço:");
			/*for (Servicos servico : Servicos.values()) {
				System.out.println("- " + servico);
			}*/
			String servico = sc.nextLine().toUpperCase();
			/*try {
				Servicos servicoEscolhido = Servicos.valueOf(servico);
				System.out.println("Você escolheu o serviço de " + servicoEscolhido + ".");
			} catch (IllegalArgumentException e) {
				System.out.println("Serviço inválido. Por favor, escolha entre CORTE ou PENTEADO.");
			}*/
			
			System.out.println("Horário:");
			
			listaClientes.add(new Cliente(nome, servico));
			horarios.setCliente(Horas.H10, Dias.TERCA, cliente);
		}
        
		System.out.println();
		System.out.println("Cronograma da semana:");
		System.out.println();

		/*for (int i = 0; i <= vetor.length; i++) {
			System.out.println(vetor[i][0]);
		}*/
	}
}