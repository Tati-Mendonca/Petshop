import java.util.Scanner;

public class FolhaDePagamento {

	public static void main(String[] args) {
		Scanner leitorNumeros = new Scanner(System.in);
		Scanner leitorTexto = new Scanner(System.in);
		
		System.out.println("PetShop FIAP\n\nDigite a quantidade de horas trabalhadas: ");
		int quantidade = leitorNumeros.nextInt();
		double quantidadeHorasExtra, valorHorasExtras;
		
		double valorHora = 18;
		double salario = valorHora * quantidade;
		System.out.println("Salario Bruto: " + salario);
		
		quantidadeHorasExtra = leitorNumeros.nextDouble();
		System.out.println("\nAgora digite a quantidade de horas extras realidas exceto domingos e feriados: ");
		
		
		valorHorasExtras = ((valorHora * 0.5) + valorHora) * quantidadeHorasExtra; 
		
		double salarioFinal = salario + valorHorasExtras;
		
		System.out.println("Valor Total ficou em: " + salarioFinal);
				
		

	}

}
