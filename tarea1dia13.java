import java.util.Scanner;
public class tarea1dia13 {
	
public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);
	
	System.out.println("ingrese numero 1: ");
	int numero1 = scanner.nextInt();
	
	System.out.println("Ingrese numero 2: ");
	int numero2 = scanner.nextInt();
	
	System.out.println("Ingrese numero 3 ");
	int numero3 = scanner.nextInt();
	
	int numeros = numero1 + numero2 + numero3;
	
	System.out.println("El producto es: " + numeros);
	
}
}
