public class MenorIndice
{
    public static void main()
    {
        Lista lista = new Lista(5, 10);
        int menor = 0;
        for (int i = 1; i < 5; i++)
        {
            if (lista.get(i) < lista.get(menor))
            {
                menor = i;
            }
        }
        System.out.println("Menor da lista: " + lista.get(menor));
    }
}
