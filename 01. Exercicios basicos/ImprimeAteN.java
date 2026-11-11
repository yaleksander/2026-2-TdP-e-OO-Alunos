import java.util.Scanner;

public class ImprimeAteN
{
    public static void main()
    {
        System.out.print("Digite um numero: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++)
        {
            System.out.print((i + 1) + " ");
        }
        System.out.println();
    }
}
