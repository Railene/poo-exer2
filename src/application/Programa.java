package application;

import java.time.Instant;
import java.util.Locale;
import java.util.Scanner;

import entidades.Funcionario;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcionario func = new Funcionario();
		System.out.print("Informe o Nome: ");
		func.nome =  sc.nextLine();
		
		System.out.print("Informe o Salário Bruto: ");
		func.SalarioBruto =  sc.nextDouble();
		
		System.out.print("Informe o Imposto: ");
		func.Imposto =  sc.nextDouble();
		
		System.out.println();
		System.out.println("Funcionário: "+ func);
		
		System.out.println();
		System.out.println("Informe a Porcentagem para aumentar o Salário: ");
		double porcentagem = sc.nextDouble();
		func.AumentarSalario(porcentagem);
		
		System.out.println();
		System.out.println("Dados Atualizados: " +func);
		sc.close();
		
		
		
	}
		
}
