public class Lista<T>
{
    private NoLista<T> raiz;
    
    public Lista()
    {
        raiz = null;
    }
    
    public void insere(T novoNo)
    {
        if (this.raiz == null)
            this.raiz = new NoLista(novoNo);
        else
            this.raiz.insere(new NoLista(novoNo));
    }
    
    public void remove(int indice)
    {
        if (indice == 0)
            this.raiz = null;
        else if (this.raiz != null)
            this.raiz.remove(indice - 1);
    }
    
    public NoLista<T> busca(T conteudo)
    {
        if (this.raiz == null)
            return null;
        return this.raiz.busca(conteudo);
    }
    
    public T get(int indice)
    {
        if (this.raiz == null)
            return null;
        return this.raiz.get(indice);
    }
    
    public void imprime()
    {
        if (this.raiz != null)
            this.raiz.imprime();
    }
}
