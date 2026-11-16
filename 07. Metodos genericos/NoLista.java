public class NoLista<T>
{
    private T conteudo;
    private NoLista prox;
    
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
    
    public void remove(int indice)
    {
        NoLista p = this;
        for (int i = 0; i < indice && p.prox != null; i++)
            p = p.prox;
        if (p.prox != null)
            p.prox = p.prox.prox;
    }
    
    public NoLista busca(T conteudo)
    {
        for (NoLista p = this; p != null; p = p.prox)
            if (p.conteudo == conteudo)
                return p;
        return null;
    }
    
    public void imprime()
    {
        for (NoLista p = this; p != null; p = p.prox)
            System.out.print(p.conteudo + "; ");
        System.out.println();
    }
}
