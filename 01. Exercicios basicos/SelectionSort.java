public class SelectionSort
{
    public static void main()
    {
        Lista lista = new Lista(20, 10);
        for (int j = 0; j < 19; j++)
        {
            int menor = j;
            for (int i = j + 1; i < 20; i++)
            {
                if (lista.get(i) < lista.get(menor))
                {
                    menor = i;
                }
            }
            int aux = lista.get(j);
            lista.set(j, lista.get(menor));
            lista.set(menor, aux);
        }
        System.out.print("Lista ordenada:");
        lista.imprime();
    }
}
