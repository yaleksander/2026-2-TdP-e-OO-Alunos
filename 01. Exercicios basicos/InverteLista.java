public class InverteLista
{
    public static void main()
    {
        Lista lista = new Lista(5, 10);
        System.out.print("Lista invertida:");
        for (int i = 4; i >= 0; i--)
        {
            System.out.print(" " + lista.get(i));
        }
        System.out.println();
    }
}