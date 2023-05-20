package trabalho;

import java.util.Scanner;

public class Layout {

	private Cofrinho cofrinho;

	public Layout() {
		cofrinho = new Cofrinho();
	}

	Scanner entrada = new Scanner(System.in);

	public void exibirLayout() {

		System.out.println("Olá, Bem vindo(a) ao cofrinho em JAVA!");
		System.out.println("1 - Adicionar Moeda");
		System.out.println("2 - Remover Moeda");
		System.out.println("3 - Listar Moedas");
		System.out.println("4 - Calcular total convertido para real");
		System.out.println("0 - Encerrar..");
		String opc = entrada.next();


		int tipoMoeda;

		switch (opc) {
		case "0":
			System.out.println("Sistema finalizado!");
			break;
		case "1":
			System.out.println("Escolha a moeda: ");
			System.out.println("1 - Real:");
			System.out.println("2 - Dólar:");
			System.out.println("3 - Euro:");
			tipoMoeda = entrada.nextInt();

			System.out.println("Digite o valor: ");
			String valorTextualMoeda = entrada.next();
			valorTextualMoeda = valorTextualMoeda.replace(",", ".");
			double valorMoeda = Double.parseDouble(valorTextualMoeda);

			Moeda moeda = null;

			if (tipoMoeda == 1) {
				moeda = new Real(valorMoeda);
				cofrinho.adicionar(moeda);
			} else if (tipoMoeda == 2) {
				moeda = new Dolar(valorMoeda);
				cofrinho.adicionar(moeda);
			} else if (tipoMoeda == 3) {
				moeda = new Euro(valorMoeda);
				cofrinho.adicionar(moeda);
			} else {
				System.out.println("Não existe essa moeda!");
				exibirLayout();
			}

			System.out.println("Moeda adicionada\n");

			exibirLayout();
			break;

		case "2":
			System.out.println("Escolha a moeda: ");
			System.out.println("1 - Real:");
			System.out.println("2 - Dólar:");
			System.out.println("3 - Euro:");
			tipoMoeda = entrada.nextInt();
			
			System.out.println("Digite o valor: ");
			valorTextualMoeda = entrada.next();
			valorTextualMoeda = valorTextualMoeda.replace(",", ".");
			valorMoeda = Double.parseDouble(valorTextualMoeda);

			moeda = null;
			
			if (tipoMoeda == 1) {
				moeda = new Real(valorMoeda);
			} else if (tipoMoeda == 2) {
				moeda = new Dolar(valorMoeda);
			} else if (tipoMoeda == 3) {
				moeda = new Euro(valorMoeda);
			} else {
				System.out.println("Não existe essa moeda!");
				exibirLayout();
			}

			boolean removeuMoeda = cofrinho.remover(moeda);
			
			if(removeuMoeda) {
				System.out.println("Moeda removida com sucesso!");
			} else {
				System.out.println("Não foi encontrada nenhuma moeda com esse valor!");
			}

			exibirLayout();
			break;
			
		case "3":
			cofrinho.listagemMoedas();
			exibirLayout();
			break;
			
		case "4":
			double valorTotalConvertido = cofrinho.totalConvertido();
			System.out.println("O valor total convertido para real: " + valorTotalConvertido);
			exibirLayout();
			break;
			
		default:
			System.out.println("Opção inválida");
			exibirLayout();
			break;

		}
	}
}