public class MenorDaLista
{
    public static void main()
    {
        Lista lista = new Lista(5, 10);
        int menor = lista.get(0);
        for (int i = 1; i < 5; i++)
        {
            if (lista.get(i) < menor)
            {
                menor = lista.get(i);
            }
        }
        System.out.println("Menor da lista: " + menor);
    }
}
