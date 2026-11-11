public class Lista
{
    private NoLista raiz;
    
    public Lista()
    {
        this.raiz = null;
    }
    
    public int tamanho()
    {
        if (this.raiz == null)
            return 0;
        return this.raiz.tamanho();
    }
    
    public int busca(int valor)
    {
        if (this.raiz == null)
            return -1;
        return this.raiz.busca(valor);
    }
    
    public void insere(int valor)
    {
        if (this.raiz == null)
            this.raiz = new NoLista(valor);
        else
            this.raiz.insere(new NoLista(valor));
    }

    public void remove(int indice)
    {
        if (this.raiz != null && indice >= 0)
        {
            if (indice > 0)
                this.raiz.remove(indice);
            else
                this.raiz = this.raiz.remove(indice);
        }
    }
    
    public void imprime()
    {
        System.out.print("[");
        if (this.raiz != null)
            this.raiz.imprime();
        System.out.println("]");
    }
}
