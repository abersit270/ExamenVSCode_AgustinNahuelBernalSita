package parte1;
import java.util.Scanner;
public class ClaseJugador {
	public static void main(String[]args){
			Scanner lector =new Scanner(System.in);
			int numero1=Integer.parseInt(lector.nextLine());
			int numero2=Integer.parseInt(lector.nextLine());
			int elegir=Integer.parseInt(lector.nextLine());
			int resultado = 0;
			switch(elegir){
				case 0:
					resultado=numero1+numero2;
					break;
				case 1:
				resultado= numero1-numero2;
				break;
			
		}
	}	
}