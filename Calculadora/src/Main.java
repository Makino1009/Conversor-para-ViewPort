import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		
		
		int i;
		System.out.println("O que deseja fazer? \n 0 - Sair \n 1 - Executar o conversor de pontos ");
		i = teclado.nextInt();
		
		while (i != 0) {
		
		float minR; 
		float maxR;
		float coordR; 
		
		int minVP; 
		int maxVP; 
		
		
		
		
		
		
		
		
     	System.out.println("Digite (1) a coordenada mínima, (2) a coordenada máxima, (3) a coordenada atual");
     	
     	minR = teclado.nextFloat();
     	maxR = teclado.nextFloat();
     	coordR = teclado.nextFloat();
     	
     	
		System.out.println("Digite (1) a coordenada mínima do viewport e (2) a coordenada máxima do viewport");

		minVP = teclado.nextInt();
		maxVP = teclado.nextInt();
		
		
		System.out.println(Calculadora.RealParaVP(minR, maxR, coordR, minVP, maxVP));
		
		
		System.out.println("O que deseja fazer? \n 0 - Sair \n 1 - Executar novamente o conversor de pontos ");
		i = teclado.nextInt();
		
		
		}
	}
	
	
	
	
	
}
