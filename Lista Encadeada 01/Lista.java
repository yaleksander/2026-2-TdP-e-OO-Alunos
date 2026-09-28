public class Lista
{
    private double valor;
    private Lista prox;
    
    public Lista(double valor)
    {
        this.valor = valor;
        this.prox = null;
    }

    public Lista get(int indice)
    {
        Lista p = this;
        for (int i = 0; i < indice && p != null; i++)
        {
            p = p.prox;
        }
        return p;
    }
    
    public void set(int indice, double valor)
    {
        Lista p = this;
        for (int i = 0; i < indice && p != null; i++)
        {
            p = p.prox;
        }
        if (p != null)
        {
            p.valor = valor;
        }
    }
    
    public int tamanho()
    {
        int n = 0;
        for (Lista p = this; p != null; p = p.prox)
        {
            n++;
        }
        return n;
    }
    
    public void imprime()
    {
        // imprima este elemento e todos os seguintes
    }

    public void remove(int indice)
    {
        // remova o elemento da lista de indice correspondente
    }
    
    public void insereNoFim(Lista l)
    {
        // insira um novo elemento no fim da lista
    }
}