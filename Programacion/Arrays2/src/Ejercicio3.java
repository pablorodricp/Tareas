import java.util.*;
public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int [][] matriz1;
		matriz1 = new int[3][3];
		
		int [][] matriz2;
		matriz2 = new int[3][3];
		
		
		System.out.println("Introduzca numeros para rellenar la matriz1");
		for (int n=0;n<3;n++) {
			
			for (int m=0;m<3;m++ ) {
				System.out.println("Fila "+n+" Columna "+m);
				matriz1[n][m] = entrada.nextInt();
				
			}
		}
		
		System.out.println("Introduzca numeros para rellenar la matriz2");
		for (int n=0;n<3;n++) {
			
			for (int m=0;m<3;m++) {
				System.out.println("Fila "+n+" Columna "+m);
				matriz2[n][m] = entrada.nextInt();
			}
		}
		
		for (int n=0;n<3;n++) {
			
			for (int m=0;m<3;m++) {
				matriz1[n][m] += matriz2[n][m];
			}
		}
		for (int n=0;n<3;n++) {
			for (int m=0;m<3;m++) {
				System.out.print(matriz1[n][m]+" ");
			}
		System.out.println("\n");
		}
		
	}

}
