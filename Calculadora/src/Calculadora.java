
public class Calculadora {

	static int RealParaVP (float y, float x, float z, int a, int b) { 
		
		float aux;
		float aux2;
		
/**     x = min		 
		y = max 
		z = coord 
		a = minvp
		b = maxvp   **/
		
		aux=y-x;
		aux2 =z/aux;
		
		aux=a-b;
		aux = (aux*aux2);
		return (int) aux ;
		
		
	}
}
