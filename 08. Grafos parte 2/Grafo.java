public class Grafo
{
    private Lista<Lista<Integer>> listaAdj;
    private int tamanho;
    
    public Grafo(int tamanho)
    {
        this.listaAdj = new Lista();
        this.tamanho = tamanho;
        for (int i = 0; i < tamanho; i++)
            this.listaAdj.insere(new Lista());
    }
    
    public void adicionaAresta(int origem, int destino)
    {
        this.listaAdj.get(origem).insere(destino);
        this.listaAdj.get(destino).insere(origem);
    }
    
    public void removeAresta(int origem, int destino)
    {
        this.listaAdj.get(origem).remove(destino);
        this.listaAdj.get(destino).remove(origem);
    }
    
    public void imprime()
    {
        for (int i = 0; i < this.tamanho; i++)
        {
            System.out.print(i + ": ");
            this.listaAdj.get(i).imprime();
            System.out.println();
        }
    }
}
