package com.poo.classes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;

@SpringBootApplication
public class ClassesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClassesApplication.class, args);
		Scanner scanner = new Scanner(System.in);

		//criação de um Gerente
		Funcionario gerente = new Gerente("João da Silva", "123.456.789-00", 1, "joao.silva", "senha123", 5000.0);

		boolean sair = false;
		while (!sair) {
			System.out.println("\n--- Menu ---");
			System.out.println("1. Imprimir Contracheque");
			System.out.println("2. Sair");

			System.out.print("\nEscolha uma opção: ");
			int opcao = scanner.nextInt();

			switch (opcao) {
				case 1:
					// Verifica se o funcionário é um Gerente para imprimir o contracheque
					if (gerente instanceof Gerente) {
						Gerente gerenteCast = (Gerente) gerente;
						gerenteCast.imprimeContraCheque();
					} else {
						System.out.println("Apenas Gerentes podem imprimir o contracheque.");
					}
					break;
				case 2:
					sair = true;
					System.out.println("Saindo...");
					break;
				default:
					System.out.println("Opção inválida.");
					break;
			}
		}

		scanner.close();
	}
}
