package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Agenda;
import entidades.Cliente;
import entidades.Corte;
import entidades.Penteado;
import entidades.ServicoAbstrata;
import entidades.Enumeradas.Cortes;
import entidades.Enumeradas.Dias;
import entidades.Enumeradas.Horas;
import entidades.Enumeradas.Penteados;

public class Programa {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Agenda horarios = new Agenda();
		Cliente[][] agenda = new Cliente[Horas.values().length][Dias.values().length];
		List<Cliente> listaClientes = new ArrayList<>();
		List<ServicoAbstrata> listaServicos = new ArrayList<>();

		System.out.println("Registro de clientes da TechSphere");
		System.out.println();
		System.out.println("Olá, BeautySphere!");
		System.out.println();
		System.out.println("Quantos clientes para essa semana?");
		int n = sc.nextInt();
		sc.nextLine();

		// Digitar clientes
		for (int i = 0; i < n; i++) {
			System.out.println();
			System.out.println("Cliente #" + (i + 1) + ":");
			System.out.println("Nome:");
			sc.next();
			String nome = sc.nextLine();

			// Digitar curvatura
			System.out.println();
			System.out.println("Liso (1), Ondulado (2), Cacheado (3), Crespo (4)");
			System.out.println("Qual a curvatura do cabelo?");
			char curvatura = sc.next().charAt(0);

			// Digitar comprimento
			System.out.println();
			System.out.println("Curto (1), Médio (2), Longo (3)");
			System.out.println("Qual o comprimento do cabelo?");
			char comprimento = sc.next().charAt(0);

			// Escolher servico
			System.out.println();
			System.out.println("Escolha o serviço: corte (C) ou penteado (P):");
			char servico = sc.next().toUpperCase().charAt(0);

			// Escolher corte
			if (servico == 'C') {
				
				System.out.println();
				System.out.println("Cortes disponíveis:");
				for (Cortes corte : Cortes.values()) {
					System.out.println("• " + corte);
				}

				System.out.println();
				System.out.println("Escolha o corte:");
				Cortes corte = Cortes.valueOf(sc.next().toUpperCase());
				
				listaServicos.add(new Corte(curvatura, comprimento, corte));

			//Tarefa para escolher penteado
			} else if (servico == 'P'){
				
				System.out.println();
				System.out.println("Penteados disponíveis:");
				for (Penteados penteado : Penteados.values()) {
					System.out.println("• " + penteado);
				}

				
				System.out.println();
				System.out.println("Escolha o penteado:");
				Penteados penteado = Penteados.valueOf(sc.next().toUpperCase());
				
				listaServicos.add(new Penteado(curvatura, comprimento, penteado));
				
			} else {
				System.out.println("Serviço inválido");
			}

			System.out.println();
			System.out.println("Escolha o horário:");

			for (Horas hora : Horas.values()) {
				System.out.println("• " + hora);
			}

			String horaEscolhida = sc.next().toUpperCase();
			Horas hora;

			System.out.println("Escolha o dia:");

			for (Dias dia : Dias.values()) {
				System.out.println("• " + dia);
			}

			String diaEscolhido = sc.next().toUpperCase();

			Dias dia;

		}

		// TERMINAR Exibindo a agenda
		System.out.println();
		System.out.println("Cronograma da semana:");
		
		sc.close();
	}
}
// VERIFICAR HORARIOS MARCADOS

// VERIFICAR RESPOSTA DO CORTE
/*
 * boolean corteValido = false; // Variável para controlar a validação do corte
 * 
 * while (!corteValido) { // Enquanto o corte não for válido
 * System.out.println(); System.out.print("Escolha o corte: "); String
 * corteInput = sc.nextLine().toUpperCase(); // Converter entrada para
 * maiúsculas
 * 
 * try { corteEscolhido = Cortes.valueOf(corteInput); // Tentar converter para
 * enum corteValido = true; // Atualiza para verdadeiro se o corte for válido }
 * catch (IllegalArgumentException e) { System.out.println();
 * System.out.println("Corte inválido. Por favor, tente novamente."); }
 */
