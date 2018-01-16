import java.util.*;
public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int [][] matriz1;
		matriz1 = new int[5][5];
		
		int m = 0;
		
		for (int n=0; n<5; n++) {
			
			matriz1[n][m] = n+m;
			
			System.out.println(matriz1[n][m]);
			
			m++;
		}
		
		
	}

}
