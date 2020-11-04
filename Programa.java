import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("BANCO WANDERSON");
		System.out.println();
		System.out.println("Programa que lê os dados de uma conta bancária, em seguida o usuário irá realizar um "
				+ "saque nessa conta bancaria, mostrando o\nnovo saldo. Lembrando que um saque não pode ocorrer se "
				+ "não houver saldo ou se o valor do saque for superior ao limite de\nretirada.");
		System.out.println();
		System.out.println("##Informe os dados da sua conta##");
		System.out.println();
		
		try {
			System.out.print("Informe o número da sua conta : ");
			int numero = sc.nextInt();
				
			System.out.print("Informe o nome do titular da conta : ");
			sc.nextLine();
			String titular = sc.nextLine();
				
			System.out.print("Informe o seu saldo inicial da conta : ");
			Double saldo = sc.nextDouble();
				
			System.out.print("Informe o seu limite de retirada da conta : ");
			Double limiteRetirada = sc.nextDouble();
				
			System.out.println();
				
			Conta c1 = new Conta(numero, titular, saldo, limiteRetirada);
			System.out.print("#Os dados da conta são#");
			System.out.println(c1.toString());
				
			System.out.println();
				
			System.out.print("Informe um valor para saque => ");
			double quantidade = sc.nextInt();
			c1.sacar(quantidade);
		}
		catch (InputMismatchException e) {
			System.out.println("O número da conta tem que ser informado em dígitos numericos.");
		}
		catch (RuntimeException e) {
			System.out.println("Erro na entrada de dados !!!");
		}
		sc.close();
	}

}