import java.util.Scanner;

public class QuantidadeVogais
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma frase:");
        String str = sc.nextLine();
        int vogais = 0;
        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')
            {
                vogais++;
            }
        }
        System.out.println("Sua frase tem " + vogais + " vogais");
    }
}
