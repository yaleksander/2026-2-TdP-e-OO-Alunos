import java.util.Scanner;

public class QuantidadeVogaisSwitchCase
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma frase:");
        String str = sc.nextLine();
        int vogais = 0;
        for (int i = 0; i < str.length(); i++)
        {
            switch (str.charAt(i))
            {
                case 'a': case 'e': case 'i': case 'o': case 'u':
                case 'A': case 'E': case 'I': case 'O': case 'U':
                    vogais++;
            }
        }
        System.out.println("Sua frase tem " + vogais + " vogais");
    }
}
