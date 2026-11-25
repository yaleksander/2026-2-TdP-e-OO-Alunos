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
    }
    
    public void removeAresta(int origem, int destino)
    {
        this.listaAdj.get(origem).remove(destino);
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
    
    public void buscaEmLargura(int inicio)
    {
        
    }
    
    public void buscaEmProfundidade(int inicio)
    {
        boolean[] visitados = new boolean[this.tamanho];
        for (int i = 0; i < this.tamanho; i++)
            visitados[i] = i == inicio;
        this.buscaEmProfundidade(inicio, visitados);
        System.out.println();
    }
    
    private void buscaEmProfundidade(int x, boolean[] visitados)
    {
        
    }
}
