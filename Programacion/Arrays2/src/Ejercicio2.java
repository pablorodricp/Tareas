import java.util.*;
public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		boolean simetrico = true;
		
		
		int [][] matriz1;
		matriz1 = new int[4][4];
		
		System.out.println("Introduzca numeros para rellenar la matriz");
		for (int n=0;n<4;n++) {
			
			for (int m=0;m<4;m++ ) {
				System.out.println("Fila "+n+" Columna "+m);
				matriz1[n][m] = entrada.nextInt();
				
			}
		}
		
		
		for (int n=0;n<4;n++) {
			
			for (int m=0;m<4;m++) {
				System.out.print(matriz1[n][m]+" ");
			}
			System.out.println("\n");
		}
		
		for (int n=0;n<4 && simetrico == true;n++) {
			
			for (int m=0;m<4 && simetrico == true;m++) {
				if (matriz1[n][m] != matriz1[m][n]) {
					simetrico = false;
				}
		}		
	}
		
		if (simetrico == true) {
			System.out.println("La matriz es simetrica");
		}else {
			System.out.println("La matriz no es simetrica");
		}
		

	}

}
