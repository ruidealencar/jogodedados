import java.util.Random;
import java.util.Scanner;

public class Principal 
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner (System.in);
		Random n = new Random();
		
		
		System.out.println("********************************************************************");
		System.out.println("***************************JOGO DE DADOS****************************");
		System.out.println("********************************************************************");
		System.out.println("VAMOS JOGAR UM DADO E VOC� VAI DIGITAR SEU PALPITE DE 0 - 6 � CLARO ");
		System.out.println("Qual seu Palpite? ");
		int palpite = scan.nextInt();
		System.out.println("Palpite = "+palpite);
		int resultado = n.nextInt(6)+1;
		System.out.println("Resultado = "+resultado);
		
		
		
		if (palpite == resultado)
		{
			System.out.println("PARAB�S VOC� GANHOU : )");
			
		}else
		{
			System.out.println("INFELIZMENTE VOC� PERDEU : (");
		}
		
		scan.close();	

	}

}
