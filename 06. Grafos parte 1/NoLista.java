public class NoLista
{
    private int valor;
    private NoLista prox;

    public NoLista(int valor)
    {
        this.valor = valor;
        this.prox = null;
    }

    public int tamanho()
    {
        int n = 0;
        for (NoLista p = this; p != null; p = p.prox)
            n++;
        return n;
    }
    
    public int busca(int valor)
    {
        NoLista p = this;
        for (int i = 0; p != null; p = p.prox, i++)
            if (p.valor == valor)
                return i;
        return -1;
    }

    public void insere(NoLista l)
    {
        NoLista p = this;
        while (p.prox != null)
            p = p.prox;
        p.prox = l;
    }
    
    public NoLista remove(int indice)
    {
        NoLista p = this;
        for (int i = 0; i < indice && p != null; i++)
            p = p.prox;
        if (p != null && p.prox != null)
        {
            NoLista r = p.prox;
            p.prox = r.prox;
            r.prox = null;
            return p;
        }
        return null;
    }
    
    public void imprime()
    {
        NoLista p = this;
        System.out.print(p.valor);
        for (p = p.prox; p != null; p = p.prox)
            System.out.print(", " + p.valor);
    }
}
