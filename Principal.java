import java.util.Random;
import java.util.Scanner;

public class Principal 
{

	public static void main(String[] args)
	{
	
		Scanner scan = new Scanner (System.in);
		Random n = new Random();
		String resposta = "s";
		
	
		System.out.println("********************************************************************");
		System.out.println("***************************JOGO DE DADOS****************************");
		System.out.println("********************************************************************");
		System.out.println("VAMOS JOGAR UM DADO E VOCÊ VAI DIGITAR SEU PALPITE DE 1 - 6 É CLARO ");
	do{
		System.out.println("Qual seu Palpite? ");
		int palpite = scan.nextInt();
		
		int resultado = n.nextInt(6)+1;
		System.out.println("Resultado = "+resultado);
		if (palpite == resultado)
		{
			System.out.println("********************************************************************");
			System.out.println("************************PARABÉNS VOCÊ GANHOU************************");
			System.out.println("********************************************************************");
			System.out.println(" ");
			System.out.println("Deseja continuar?(s/n)");
			
		}else
		{
			System.out.println("********************************************************************");
			System.out.println("**********************INFELIZMENTE VOCÊ PERDEU**********************");
			System.out.println("********************************************************************");
			System.out.println(" ");
			System.out.println("Deseja continuar?(s/n)");
			
	
		}
		resposta = scan.next();
	}while(resposta.equals("s"));
		scan.close();
		System.out.println("********************************************************************");
		System.out.println("****************************FIM DE JOGO*****************************");
		System.out.println("********************************************************************");
	  }
	

}
