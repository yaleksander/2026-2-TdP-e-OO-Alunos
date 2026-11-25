public class NoLista<T>
{
    private T conteudo;
    private NoLista<T> prox;
    
    public NoLista(T conteudo)
    {
        this.conteudo = conteudo;
        this.prox = null;
    }
    
    public T getConteudo()
    {
        return this.conteudo;
    }
    
    public void insere(NoLista novoNo)
    {
        NoLista p = this;
        while (p.prox != null)
            p = p.prox;
        p.prox = novoNo;
    }
    
    public NoLista<T> remove(int indice)
    {
        if (indice-- == 0)
            return this.prox;
        NoLista p = this;
        for (int i = 0; i < indice && p.prox != null; i++)
            p = p.prox;
        if (p.prox != null)
            p.prox = p.prox.prox;
        return this;
    }
    
    public NoLista<T> busca(T conteudo)
    {
        for (NoLista p = this; p != null; p = p.prox)
            if (p.conteudo == conteudo)
                return p;
        return null;
    }
    
    public T get(int indice)
    {
        NoLista<T> p = this;
        for (int i = 0; i < indice && p != null; i++)
            p = p.prox;
        if (p == null)
            return null;
        return p.conteudo;
    }
    
    public void imprime()
    {
        for (NoLista p = this; p != null; p = p.prox)
            System.out.print(p.conteudo + " ");
    }
    
    public int tamanho()
    {
        int i = 0;
        for (NoLista p = this; p != null; p = p.prox)
            i++;
        return i;
    }
}
