public class TrocaMenor
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
        int aux = lista.get(0);
        lista.set(0, lista.get(menor));
        lista.set(menor, aux);
        System.out.print("Lista:");
        lista.imprime();
    }
}
