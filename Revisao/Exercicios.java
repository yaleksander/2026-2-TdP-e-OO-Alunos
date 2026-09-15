import java.util.Scanner;
import java.lang.Math;

public class Exercicios
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o tamanho da lista: ");
        int n = sc.nextInt();
        Lista lista = new Lista(n, 10);
        System.out.println("Itens divisiveis por 3:");
        System.out.print("Valor: ");
        for (int i = 0; i < n; i++)
        {
            if (lista.get(i) % 3 == 0)
            {
                System.out.print(" " + lista.get(i));
            }
        }
        System.out.println();
        System.out.print("Indice:");
        for (int i = 0; i < n; i++)
        {
            if (lista.get(i) % 3 == 0)
            {
                System.out.print(" " + i);
            }
        }
        System.out.println();
        int menor = 0;
        for (int i = 1; i < n; i++)
        {
            if (lista.get(i) < lista.get(menor))
            {
                menor = i;
            }
        }
        System.out.println("O menor numero da lista é " + lista.get(menor));
        int aux = lista.get(0);
        lista.set(0, lista.get(menor));
        lista.set(menor, aux);
        System.out.print("Nova lista (apos substituicao):");
        lista.imprime();
        System.out.print("Digite um numero real x: ");
        double x = sc.nextDouble();
        menor = 0;
        for (int i = 1; i < n; i++)
        {
            if (Math.abs(x - lista.get(i)) < Math.abs(x - lista.get(menor)))
            {
                menor = i;
            }
        }
        System.out.println("O numero mais proximo de " + x + " é " + lista.get(menor) + ", no indice " + menor);
    }
}
