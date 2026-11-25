public class Main
{
    public static void main()
    {
        Grafo g = new Grafo(5);
        g.adicionaAresta(0, 1);
        g.adicionaAresta(2, 0);
        g.adicionaAresta(1, 2);
        g.adicionaAresta(0, 4);
        g.buscaEmProfundidade(0);
        g.buscaEmLargura(0);
    }
}
