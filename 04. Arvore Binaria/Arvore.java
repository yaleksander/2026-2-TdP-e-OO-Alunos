public class Arvore
{
    private No raiz;
    
    public Arvore()
    {
        this.raiz = null;
    }
    
    public int altura()
    {
        if (this.raiz == null)
            return -1;
        return this.raiz.altura();
    }
    
    public void imprime()
    {
        if (this.raiz != null)
            this.raiz.imprime(0);
    }
    
    public void insere(int v)
    {
        if (this.raiz != null)
            this.raiz.insere(new No(v));
        else
            this.raiz = new No(v);
    }
}
