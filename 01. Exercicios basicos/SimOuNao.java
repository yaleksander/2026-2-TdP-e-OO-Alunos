import java.util.Scanner;

public class SimOuNao
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Voce gosta de bolo (s/n)? ");
        String resposta = sc.nextLine();
        if (resposta.equals("s"))
        {
            System.out.println("Que bom!");
        }
        else if (resposta.equals("n"))
        {
            System.out.println("Mentira.");
        }
        else
        {
            System.out.println("Nao entendi sua resposta.");
        }
    }
}