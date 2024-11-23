package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Agenda;
import entidades.Caixa;
import entidades.Cliente;
import entidades.Corte;
import entidades.Penteado;
import entidades.Servico;
import entidades.Enumeradas.Cortes;
import entidades.Enumeradas.Dias;
import entidades.Enumeradas.Horas;
import entidades.Enumeradas.Penteados;
import entidades.Cartao;
import entidades.Dinheiro;
import entidades.Pagamento;

public class Programa {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Cliente> listaClientes = new ArrayList<>();
		List<Horas> horariosDisponiveis = new ArrayList<>();
		Agenda agenda = new Agenda(listaClientes, horariosDisponiveis);
		Servico servico;

		System.out.println("Registro de clientes da TechSphere");
		System.out.println();
		System.out.println("Olá, BeautySphere!");
		System.out.println();
		System.out.println("Quantos clientes para essa semana?");
		int n = sc.nextInt();
		
		// Digitar clientes
		for (int i = 0; i < n; i++) {
			System.out.println();
			System.out.println("Cliente #" + (i + 1) + ":");
			System.out.println("Nome:");
			sc.nextLine();
			String nome = sc.nextLine();

			// Escolher horario
			System.out.println("Horários disponíveis:");
			agenda.exibirHorarios();

			System.out.println("Escolha um horário:");
			String horarioEscolhido = sc.nextLine().toUpperCase();
			agenda.marcarHorario(horarioEscolhido);

			// Digitar curvatura
			System.out.println();
			System.out.println("Liso (1), Ondulado (2), Cacheado (3), Crespo (4)");
			System.out.println("Qual a curvatura do cabelo?");
			char curvaturaChar = sc.next().charAt(0);

			String curvatura = null;
			if (curvaturaChar == '1') {
				curvatura = "liso";
			} else if (curvaturaChar == '2') {
				curvatura = "ondulado";
			} else if (curvaturaChar == '3') {
				curvatura = "cacheado";
			} else if (curvaturaChar =='4') {
				curvatura = "crespo";
			}

			// Digitar comprimento
			System.out.println();
			System.out.println("Curto (1), Médio (2), Longo (3)");
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
				for (Cortes corte : Cortes.values()) {
					System.out.println("• " + corte);
				}

				System.out.println();
				System.out.println("Escolha o corte:");
				Cortes corte = Cortes.valueOf(sc.next().toUpperCase());

				servico = new Corte(curvatura, comprimento, corte);
				Cliente cliente = new Cliente(nome, horarioEscolhido, servico);
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
				Cliente cliente = new Cliente(nome, horarioEscolhido, servico);
				agenda.addCliente(cliente);

			} else {
				System.out.println("Serviço inválido");
			}
		}

		// Exibir a agenda
		System.out.println();
		System.out.println("Cronograma da semana:");
		agenda.exibirAgenda();

		/*// Cartão ou Dinheiro

		System.out.println();
		System.out.println("Escolha a forma de pagamento: Cartão (C) ou Dinheiro (D):");
		char pagamentoEscolhido = sc.next().toUpperCase().charAt(0);

		// Processar o pagamento
		if (pagamentoEscolhido == 'C') {
			Cartao cartao = new Cartao();
			for (ServicoAbstrata servicoItem : listaServicos) {
				double valor = servicoItem.valor();
				cartao.realizarPagamento(valor);
				System.out.println(cartao.ToString(valor));
			}
		} else if (pagamentoEscolhido == 'D') {
			Dinheiro dinheiro = new Dinheiro();
			for (ServicoAbstrata servicoItem : listaServicos) {
				double valor = servicoItem.valor();
				dinheiro.realizarPagamento(valor);
				System.out.println(dinheiro.ToString(valor));
			}
		} else {
			System.out.println("Forma de pagamento inválida.");
		}*/
	}
}
// Colocar parte da fatura total

/*
 * System.out.println(); System.out.println("Faturamento total:");
 * 
 * Caixa caixa = new Caixa();
 * 
 * System.out.println("Total faturado: R$" + caixa.faturamento(pagamento));
 */

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
