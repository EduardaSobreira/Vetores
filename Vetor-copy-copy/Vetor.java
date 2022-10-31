import java.util.Scanner;
/**
 * Escreva uma descrição da classe Vetor aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Vetor
{
    public static void main(String args[])
    {
      Scanner in = new Scanner(System.in);
      int termos;
      
      
      System.out.println("Digite a quantidade de termos: ");
      termos = in.nextInt();
      
      int fibo[] = new int[termos];
      for (int n=0; n<termos;n++)
      {
          if (n==0 || n==1)
            fibo[n]=1;
            
        else
          fibo[n] = fibo[n-1] + fibo[n-2];
      }
      
      for (int n=0; n<termos;n++){
         System.out.println("Na posição "+n+" tem o valor: " + fibo[n]);
        }
    
    }
}
