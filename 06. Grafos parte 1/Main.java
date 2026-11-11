public class Main
{
    public static void main()
    {
        Grafo g = new Grafo();
        g.adicionaVertice(0);
        g.adicionaVertice(1);
        g.adicionaVertice(2);
        g.adicionaAresta(0, 1);
        g.adicionaAresta(0, 2);
        g.adicionaAresta(1, 2);
        g.imprime();
    }
}
