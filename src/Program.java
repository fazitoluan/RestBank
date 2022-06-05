import java.util.Scanner;
import java.util.Locale;
import entities.Conta;


public class Program {
	
	public static void transferir(Conta debito, Conta credito, double valor) {
		double validadorSaque = debito.getSaldo();
		debito.sacar(valor);
		if(validadorSaque != debito.getSaldo()) {
			credito.depositar(valor);
		}
	}
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		Conta A = new Conta("Luan", "93293219", 293193, 213912939, 500);
		Conta B = new Conta("Juliana", "4828418", 2321313, 4242111, 10000);
		
		transferir(B, A, -500);
		
		System.out.printf("Saldo da Conta A: %.2f\n", A.getSaldo());
		System.out.printf("Saldo da Conta B: %.2f\n", B.getSaldo());
		
		System.out.println(A.toString());
		System.out.println(B.toString());
		
		scan.close();
	}

}
