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
        Cliente[][] agenda = new Cliente[Horas.values().length][Dias.values().length];
        List<Cliente> listaClientes = new ArrayList<>();
        
        System.out.println("Registro de clientes da TechSphere");
        System.out.println();
        System.out.println("Olá, BeautySphere!");
        System.out.println();
        System.out.println("Quantos clientes para essa semana?");
        int n = sc.nextInt();
        sc.nextLine(); // Consumir a quebra de linha após o número
        
        for (int i = 0; i < n; i++) {
            System.out.println();
            System.out.println("Cliente #" + (i + 1) + ":");
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            
            System.out.println("Serviço:");
            
            for (Servicos servico : Servicos.values()) {
                System.out.println("• " + servico);
            }
            
            String servico = sc.nextLine().toUpperCase();
            Servicos servicoEscolhido;
            
            try {
                servicoEscolhido = Servicos.valueOf(servico);
                System.out.println("Você escolheu o serviço de " + servicoEscolhido + ".");
            } catch (IllegalArgumentException e) {
                System.out.println("Serviço inválido. Por favor, escolha entre CORTE ou PENTEADO.");
                continue; // Pular para o próximo loop se o serviço for inválido
            }
            
            System.out.println("Escolha o horário:");
            
            for (Horas hora : Horas.values()) {
                System.out.println("• " + hora);
            }
            
            String horaEscolhida = sc.nextLine().toUpperCase();
            Horas hora;
            
            try {
                hora = Horas.valueOf(horaEscolhida);
            } catch (IllegalArgumentException e) {
                System.out.println("Horário inválido.");
                continue;
            }
            
            System.out.println("Escolha o dia:");
            
            for (Dias dia : Dias.values()) {
                System.out.println("• " + dia);
            }
            
            String diaEscolhido = sc.nextLine().toUpperCase();
            
            Dias dia;
            
            try {
                dia = Dias.valueOf(diaEscolhido);
            } catch (IllegalArgumentException e) {
                System.out.println("Dia inválido.");
                continue;
            }
            
            // Criando o cliente e associando-o à lista e à agenda
            Cliente cliente = new Cliente(nome, servicoEscolhido.toString());
            listaClientes.add(cliente);
            agenda[hora.ordinal()][dia.ordinal()] = cliente; // CAPTURAR O INDICE NA MATRIZ AGENDA
        }
        
        // Exibindo a agenda
        System.out.println();
        System.out.println("Cronograma da semana:");
        for (Dias dia : Dias.values()) {
            System.out.println(dia + ":");
            for (Horas hora : Horas.values()) {
                Cliente cliente = agenda[hora.ordinal()][dia.ordinal()];
                if (cliente != null) {
                    System.out.println("  - " + hora + ": " + cliente.getNome() + " (Serviço: " + cliente.getServico() + ")");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
// VERIFICAR HORARIOS MARCADOS