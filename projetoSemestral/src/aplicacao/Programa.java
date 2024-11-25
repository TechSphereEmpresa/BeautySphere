// Alanna Ferreira, Eduarda Leal, Kaua Rizzo, Letícia Farias, Maria Luisa Souza

package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Agenda;
import entidades.Cliente;
import entidades.Corte;
import entidades.Penteado;
import entidades.Servico;
import entidades.Enumeradas.Cortes;
import entidades.Enumeradas.Horas;
import entidades.Enumeradas.Penteados;
import entidades.PagamentoBoleto;
import entidades.Pagamento;

public class Programa {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<Cliente> listaClientes = new ArrayList<>();
		List<Horas> horariosDisponiveis = new ArrayList<>();

		Agenda agenda = new Agenda(listaClientes, horariosDisponiveis);

		Servico servico;
		double taxa = 1.05;
		Pagamento pagamento = null;
		int nParcelas = 0;

		System.out.println("Registro de clientes da TechSphere");
		System.out.println();
		System.out.println("Bom dia, BeautySphere!");
		System.out.println();
		System.out.println("Quantos clientes para hoje?");
		int n = sc.nextInt();

		// Digitar clientes
		if (n <= 7) {
			for (int i = 0; i < n; i++) {
				System.out.println();
				System.out.println("Cliente #" + (i + 1) + ":");
				System.out.println("Nome:");
				sc.nextLine();
				String nome = sc.nextLine();

				// Escolher horario
				System.out.println();
				System.out.println("Horários disponíveis:");
				agenda.exibirHorarios();

				System.out.println();
				System.out.println("Escolha um horário:");
				String horarioEscolhido = sc.nextLine().toUpperCase();
				agenda.marcarHorario(horarioEscolhido);

				// Digitar curvatura
				System.out.println();
				System.out.println("Liso (1), Ondulado (2), Cacheado (3), Crespo (4)");
				System.out.println();
				System.out.println("Qual a curvatura do cabelo?");
				char curvaturaChar = sc.next().charAt(0);

				String curvatura = null;
				if (curvaturaChar == '1') {
					curvatura = "liso";
				} else if (curvaturaChar == '2') {
					curvatura = "ondulado";
				} else if (curvaturaChar == '3') {
					curvatura = "cacheado";
				} else if (curvaturaChar == '4') {
					curvatura = "crespo";
				}

				// Digitar comprimento
				System.out.println();
				System.out.println("Curto (1), Médio (2), Longo (3)");
				System.out.println();
				System.out.println("Qual o comprimento do cabelo?");
				char comprimentoChar = sc.next().charAt(0);

				String comprimento = null;
				if (comprimentoChar == '1') {
					comprimento = "curto";
				} else if (comprimentoChar == '2') {
					comprimento = "médio";
				} else if (comprimentoChar == '3') {
					comprimento = "longo";
				}

				// Escolher servico
				System.out.println();
				System.out.println("Escolha o serviço: corte (C) ou penteado (P):");
				char servicoEscolhido = sc.next().toUpperCase().charAt(0);

				// Escolher corte
				if (servicoEscolhido == 'C') {

					System.out.println();
					System.out.println("Cortes disponíveis:");
					for (Cortes c : Cortes.values()) {
						System.out.println("• " + c);
					}

					System.out.println();
					System.out.println("Escolha o corte:");
					Cortes corte = Cortes.valueOf(sc.next().toUpperCase());

					servico = new Corte(curvatura, comprimento, corte);

					// Boleto ou Dinheiro
					System.out.println();
					System.out.println("Escolha a forma de pagamento: Boleto (B) ou Dinheiro (D)");
					char pagamentoEscolhido = sc.next().toUpperCase().charAt(0);

					// Processar o pagamento
					double valor = servico.valor();
					if (pagamentoEscolhido == 'B') {
						System.out.println();
						while (true) {
							System.out.println("Digite o número de parcelas (até 3x):");
							nParcelas = sc.nextInt();
							if (nParcelas <= 3 && nParcelas > 0) {
								pagamento = new PagamentoBoleto(valor, taxa, nParcelas);
								break; // Sai do loop se o número de parcelas for válido
							} else {
								System.out.println(
										"Número de parcelas inválido. Por favor, insira um número de parcelas entre 1 e 3.");
							}
						}
					} else if (pagamentoEscolhido == 'D') {
						pagamento = new Pagamento(valor);
					}

					Cliente cliente = new Cliente(nome, horarioEscolhido, servico, pagamento);
					agenda.addCliente(cliente);

					// Escolher penteado
				} else if (servicoEscolhido == 'P') {

					System.out.println();
					System.out.println("Penteados disponíveis:");
					for (Penteados penteado : Penteados.values()) {
						System.out.println("• " + penteado);
					}

					System.out.println();
					System.out.println("Escolha o penteado:");
					Penteados penteado = Penteados.valueOf(sc.next().toUpperCase());

					servico = new Penteado(curvatura, comprimento, penteado);

					// Boleto ou Dinheiro
					System.out.println();
					System.out.println("Escolha a forma de pagamento: Boleto (B) ou Dinheiro (D)");
					char pagamentoEscolhido = sc.next().toUpperCase().charAt(0);

					// Processar o pagamento
					double valor = servico.valor();
					if (pagamentoEscolhido == 'B') {
						System.out.println();
						while (true) {
							System.out.println("Digite o número de parcelas (até 3x):");
							nParcelas = sc.nextInt();
							if (nParcelas <= 3 && nParcelas > 0) {
								pagamento = new PagamentoBoleto(valor, taxa, nParcelas);
								break; // Sai do loop se o número de parcelas for válido
							} else {
								System.out.println(
										"Número de parcelas inválido. Por favor, insira um número de parcelas entre 1 e 3.");
							}
						}
					} else if (pagamentoEscolhido == 'D') {
						pagamento = new Pagamento(valor);
					}

					Cliente cliente = new Cliente(nome, horarioEscolhido, servico, pagamento);
					agenda.addCliente(cliente);

				} else {
					System.out.println("Serviço inválido");
				}
			}

			// Exibir a agenda
			System.out.println();
			System.out.println("Cronograma do dia:");
			agenda.exibirAgenda();

			// Excluir cliente
			System.out.println();
			System.out.println("[Fim do dia]");
			System.out.println();
			System.out.println("Deseja excluir algum cliente? (S/N)");
			char resposta = sc.next().toUpperCase().charAt(0);

			if (resposta == 'S') {
				System.out.println();
				System.out.println("Quantos clientes excluir?");
				int quantExcluir = sc.nextInt();
				sc.nextLine();

				for (int i = 0; i < quantExcluir; i++) {
					System.out.println();
					System.out.println("Cliente para excluir #" + (i + 1) + ":");
					System.out.println("Digite o horário desse cliente:");
					String horarioExcluir = sc.nextLine().toUpperCase();
					
					listaClientes.removeIf(c -> c.getHorarioEscolhido().equals(horarioExcluir));
				}
				
				System.out.println();
				System.out.println("Lista atualizada:");
				agenda.exibirAgenda();
			}

			// Exibir faturamento
			double faturamento = 0;
			for (Cliente c : listaClientes) {
				faturamento += c.getPagamento().realizarPagamento();
			}
			System.out.println();
			System.out.println("Faturamento do dia: R$ " + String.format("%.2f", faturamento));
			System.out.println("Até amanhã, BeautySphere!");
			
			sc.close();

		} else {
			System.out.println("Quantidade de clientes inválida.");
		}
	}
}