import java.util.Scanner;		//IMPORTAR SCANNER
public class ImprimeDivisores {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);		//CREAR TECLADO
		System.out.print("Introduzca el número a hallar divisores: ");		//SOLICITA DATO
		int n = teclado.nextInt();		//ALMACENA DATO EN N
		for (int i = 1; i<=n; i++) {		//PARA N VECES
			if (n%i==0) {		//SI N ES DIVISIBLE ENTRE I
				System.out.printf("%d  -  ",i);		//IMPRIMIR I
			}										//LOS ESPACIOS Y EL GUIÓN SON ESTÉTICOS
		}
	}

}
