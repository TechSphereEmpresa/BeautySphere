package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Agenda;
import entidades.Caixa;
import entidades.Cliente;
import entidades.Corte;
import entidades.Penteado;
import entidades.ServicoAbstrata;
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
		Agenda agenda = new Agenda();
		List<Cliente> listaClientes = new ArrayList<>();
		List<String> horariosDisponiveis = new ArrayList<String>();
		horariosDisponiveis.add("09:00");
		horariosDisponiveis.add("10:00");
		horariosDisponiveis.add("11:00");
		horariosDisponiveis.add("14:00");
		horariosDisponiveis.add("15:00");
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

			// Escolher horario
			System.out.println("Horários disponíveis:");
			for (String horario : horariosDisponiveis) {
				System.out.println("• " + horario);
			}
			System.out.println("Escolha um horário:");
			String horarioEscolhido = sc.nextLine();
			horariosDisponiveis.remove(horarioEscolhido); // Remove o horário da lista de disponíveis

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
				listaClientes.add(new Cliente(nome, horarioEscolhido, listaServicos));

			// Escolher penteado
			} else if (servico == 'P') {

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
		}
		// Exibir a agenda
		System.out.println();
		System.out.println("Cronograma da semana:");

		for (Cliente c : listaClientes) {
            System.out.println(c);
        }

		// Cartão ou Dinheiro

		System.out.println();
		System.out.println("Escolha a forma de pagamento: Cartão (C) ou Dinheiro (D):");
		char pagamentoEscolhido = sc.next().toUpperCase().charAt(0);

		// Processar o pagamento
		if (pagamentoEscolhido == 'C') {
			Cartao cartao = new Cartao();
			for (ServicoAbstrata servicoItem : listaServicos) {
				double valor = servicoItem.valor();
				cartao.realizarPagamento(valor);
			}
		} else if (pagamentoEscolhido == 'D') {
			Dinheiro dinheiro = new Dinheiro();
			for (ServicoAbstrata servicoItem : listaServicos) {
				double valor = servicoItem.valor();
				dinheiro.realizarPagamento(valor);
			}
		} else {
			System.out.println("Forma de pagamento inválida.");
		}
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
