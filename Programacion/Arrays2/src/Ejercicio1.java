import java.util.*;
public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int [][] matriz1;
		matriz1 = new int[5][5];
		
		
		for (int n=0; n<5; n++) {
			
			for(int m=0; m<5; m++) {
				matriz1[n][m] = n+m;
				
				System.out.print(matriz1[n][m]);
			}
			
			System.out.println("\n");
		
			}
		
		
	}

}
