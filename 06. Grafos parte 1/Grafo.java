public class Grafo
{
    /*
     * Implemente um grafo com uma lista ou matriz de adjacencia.
     * As funcoes listadas a seguir tambem devem ser implementadas:
     * - Grafo (construtor)
     * - adicionaAresta
     * - removeAresta
     * - imprime
     */
    
    private Lista vertices;
    
    //private boolean[][] matrixAdj;
    //private Lista listaAdj;
    
    public Grafo()
    {
        // construtor do grafo (inicialmente vazio)
        this.vertices = new Lista();
        // implementar inicializacao das arestas
    }
    
    public void adicionaVertice(int valor)
    {
        this.vertices.insere(valor);
    }
    
    public void removeVertice(int valor)
    {
        this.vertices.remove(this.vertices.busca(valor));
    }
    
    public void adicionaAresta(int origem, int destino)
    {
        // adiciona uma conexao entre dois vertices
    }
    
    public void removeAresta(int origem, int destino)
    {
        // remove uma conexao entre dois vertices
    }
    
    public void imprimeVertices()
    {
        System.out.print("Elementos presentes no grafo: ");
        this.vertices.imprime();
    }
    
    public void imprime()
    {
        // imprime o grafo em sua representacao textual
    }
}
