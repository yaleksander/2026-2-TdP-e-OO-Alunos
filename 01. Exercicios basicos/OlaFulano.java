import java.util.Scanner;

public class OlaFulano
{
    public static void main()
    {
        System.out.print("Digite seu nome: ");
        Scanner sc = new Scanner(System.in);
        String nome = sc.nextLine();
        System.out.println("Ola, " + nome);
    }
}
