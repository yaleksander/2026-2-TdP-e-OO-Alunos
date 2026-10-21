public class Main
{
    public static void main()
    {
        for (int i = 10; i <= 100000; i *= 10)
            for (int j = 1; j <= 3; j++)
                imprime(i, j);
    }

    public static void imprime(int tam, int type)
    {
        Lista l = new Lista();
        l.criaSequencia(tam);
        switch (type)
        {
            case 1: l.embaralha(); l.bubbleSort(); break;
            case 2: l.embaralha(); l.selectionSort(); break;
            case 3: l.embaralha(); l.quickSort(); break;
            case 4: l.quickSort(); break;
        }
    }
}
