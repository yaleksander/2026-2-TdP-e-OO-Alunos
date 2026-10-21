public class Arvore
{
    private No raiz;
    
    public Arvore()
    {
        this.raiz = null;
    }
    
    public int tamanho()
    {
        if (this.raiz == null)
            return -1;
        return this.raiz.tamanho();
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
