public class Lista
{
    private NoLista raiz;
    
    public Lista()
    {
        raiz = null;
    }
    
    public void insere(NoLista novoNo)
    {
        if (this.raiz == null)
            this.raiz = novoNo;
        else
            this.raiz.insere(novoNo);
    }
    
    public void remove(int indice)
    {
        if (indice == 0)
            this.raiz = null;
        else if (this.raiz != null)
            this.raiz.remove(indice - 1);
    }
    
    public <T> NoLista busca(T conteudo)
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
