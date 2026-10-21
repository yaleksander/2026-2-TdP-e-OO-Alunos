public class Main
{
    public static void main()
    {
        Arvore arv = new Arvore();
        for (int i = 0; i < 10; i++)
            arv.insere(i + 1);
        arv.imprime();
    }
}